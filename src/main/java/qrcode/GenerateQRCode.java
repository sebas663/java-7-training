package qrcode;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class GenerateQRCode {
	/**
     * @param args
     * @throws WriterException
     * @throws IOException
     */
    public static void main(String[] args) throws WriterException, IOException {
        String qrCodeText = "zzzzzzzz";
        int size = 250;
        String fileType = "jpg";
        File logoImg = new File("D:/Cosas-Sebastian/CV-SEBA/fotoedi.jpg");
        File outputfile = new File("D:/Cosas-Sebastian/CV-SEBA/saved.jpg");
        createQRImage(outputfile,logoImg, qrCodeText, size, fileType);
//        f(filePath, fileType);
    }
 
    private static void createQRImage(File outputfile,File logoImg,String qrCodeText, int size,String fileType) throws WriterException, IOException {
    	Hashtable<EncodeHintType, ErrorCorrectionLevel> hints = null;
    	QRCodeWriter writer = null;
    	BitMatrix bitMatrix = null;
    	try {
	        hints = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
	        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
	        writer = new QRCodeWriter();
	        bitMatrix = writer.encode(qrCodeText, BarcodeFormat.QR_CODE, size, size, hints);
	        
    	    MatrixToImageConfig config = new MatrixToImageConfig(MatrixToImageConfig.BLACK, MatrixToImageConfig.WHITE);
    	    // Load QR image
    	    BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix, config);
	        qrImage.createGraphics();
	 
	        // Load logo image
    	    BufferedImage logoImage = ImageIO.read(logoImg);
    	    
    	    // Calculate the delta height and width between QR code and logo
    	    int deltaHeight = qrImage.getHeight() - logoImage.getHeight();
    	    int deltaWidth = qrImage.getWidth() - logoImage.getWidth();
    	    
	        Graphics2D graphics = (Graphics2D) qrImage.getGraphics();
//	        graphics.setColor(Color.WHITE);
//	        graphics.fillRect(0, 0, matrixHeight, matrixWidth);
	        // Paint and save the image using the ByteMatrix
//	        graphics.setColor(Color.BLACK);
	        // Write QR code to new image at position 0/0
	        graphics.drawImage(qrImage, 0, 0, null);
	        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_IN, 1f));

    	    // Write logo into combine image at position (deltaWidth / 2) and
    	    // (deltaHeight / 2). Background: Left/Right and Top/Bottom must be
    	    // the same space for the logo to be centered
	        graphics.drawImage(logoImage, (int) Math.round(deltaWidth / 2), (int) Math.round(deltaHeight / 2), null);
//	        for (int i = 0; i < matrixHeight; i++) {
//	            for (int j = 0; j < matrixWidth; j++) {
//	                if (bitMatrix.get(i, j)) {
//	                    graphics.fillRect(i, j, 1, 1);
//	                }
//	            }
//	        }
	     // Write combined image as PNG to OutputStream
	        ImageIO.write(qrImage, fileType, outputfile);
    	} catch (Exception e) {
			// TODO: handle exception
		}
    }
    private static void f(String logoImg,String fileType){
    	// Create new configuration that specifies the error correction
    	Map<EncodeHintType, ErrorCorrectionLevel> hints = null;
    	QRCodeWriter writer = null;
    	BitMatrix bitMatrix = null;
    	try {
    		hints = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
    	    hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
    	    writer = new QRCodeWriter();
    	    // Create a qr code with the url as content and a size of 250x250 px
    	    bitMatrix = writer.encode("http://www.wombatsoftware.de", BarcodeFormat.QR_CODE, 250, 250, hints);

//    	    MatrixToImageConfig config = new MatrixToImageConfig(MatrixToImageConfig.BLACK, MatrixToImageConfig.WHITE);
    	    MatrixToImageConfig config = new MatrixToImageConfig();

    	    // Load QR image
    	    BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix, config);

    	    // Load logo image
    	    BufferedImage logoImage = ImageIO.read(new File(logoImg));

    	    // Calculate the delta height and width between QR code and logo
    	    int deltaHeight = qrImage.getHeight() - logoImage.getHeight();
    	    int deltaWidth = qrImage.getWidth() - logoImage.getWidth();

    	    // Initialize combined image
    	    BufferedImage combined = new BufferedImage(qrImage.getHeight(), qrImage.getWidth(), BufferedImage.TYPE_INT_ARGB);
    	    combined.createGraphics();
    	    
    	    Graphics2D g = (Graphics2D) combined.getGraphics();
    	    // Write QR code to new image at position 0/0
    	    g.drawImage(qrImage, 0, 0, null);
    	    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

    	    // Write logo into combine image at position (deltaWidth / 2) and
    	    // (deltaHeight / 2). Background: Left/Right and Top/Bottom must be
    	    // the same space for the logo to be centered
    	    g.drawImage(logoImage, (int) Math.round(deltaWidth / 2), (int) Math.round(deltaHeight / 2), null);

    	    
    	    
    	    // Write combined image as PNG to OutputStream
    	    File outputfile = new File("D:/Cosas-Sebastian/CV-SEBA/saved.jpg");
    	    ImageIO.write(combined, fileType, outputfile);
    	} catch (WriterException e) {
    	} catch (IOException e) {
    	}
    }
}
