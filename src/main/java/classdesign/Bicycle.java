package classdesign;

public class Bicycle {
	private int gear;
	private int cadence;
	private int speed;
	
	public Bicycle(int gear, int cadence, int speed) {
		super();
		this.gear = gear;
		this.cadence = cadence;
		this.speed = speed;
	}

	public void printDescription(){
	    System.out.println("\nBike is " + "in gear " + this.gear
	        + " with a cadence of " + this.cadence +
	        " and travelling at a speed of " + this.speed + ". ");
	}
}
