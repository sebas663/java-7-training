package operators.decision.constructs;

public class BitDemo {
	
//	In Java the bitwise and bit shift operators are used to manipulate 
//	the contents of variables at a bit level according to binary format.
//	These operators perform bitwise and bit shift operations on integral type variables
	 public static void main(String args[]) {
	     int a = 60;	/* 60 = 0011 1100 */  
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 0;
	     
//	     The Bitwise AND (&) operator performs the bitwise AND operation on each parallel 
//	     pair of bits of two operands. The result is 1, if corresponding bits are 1 in both 
//	     operands. Otherwise, the result is 0. Lets understand the AND operations using truth table:
//
//	     A	 B	 Result
//	     0	 0	 0
//	     1	 0	 0
//	     0	 1	 0
//	     1	 1 	 1

	     c = a & b;       /* 12 = 0000 1100 */ 
	     System.out.println("a & b = " + c );

//	     The Bitwise inclusive OR ( | ) operator performs the bitwise inclusive OR 
//	     operation on each parallel pair of bits of two operands. In each pair, 
//	     the result is 1, if either first or second bit is 1 (or both are 1). 
//	     Otherwise the result is 0. Lets see the table of using inclusive operations.
//	     Lets understand the inclusive OR operations using truth table:
//
//	      A	 B	 Result
//	      0	 0	 0
//	      1	 0	 1
//	      0	 1	 1
//	      1	 1	 1

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );
	     
//	     The Bitwise exclusive OR (^) performs the exclusive or (XOR) operation i.e.  
//	     The result in each position is 1 if the two bits are different,
//	     and 0 if they are the same. Lets understand the exclusive OR operations using truth table:
//
//	    	 A	 B	 Result
//	    	 0	 0	 0
//	    	 1	 0	 1
//	    	 0	 1	 1
//	    	 1	 1	 0
	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

//	     The unary bitwise complement operator "~" inverts a bit pattern; 
//	     it can be applied to any of the integral types,
//	     making every "0" a "1" and every "1" a "0". 
//	     For example, a byte contains 8 bits;
//	     applying this operator to a value whose bit pattern 
//	     is "00000000" would change its pattern to "11111111".
//	     The unary bitwise complement ("~") operator  takes a single bit and inverts 
//	     the level of that bit pattern and can be applied to any of the integral types. 
//	     In this case, the value of a bit which is 0 become 1 and vice versa.
//	     For example the value 7 to a variable "x" is represented in binary as 0111.
//	     But after applying "~" operator, the operation will be performed on each bit 
//	     pattern which will return 1000 to the variable and the value 8 in the decimal format.
//	    		 Lets use the table to understand bitwise complement operation.
	    
//	     Operand	 Result
//	     0	          1
//	     1	          0
//	     1	          0
//	     0	          1
	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );
	     
	     
//	     Sign Bit:
//
//	    	 A sign bit is found in the left most position of the number and is know 
//	    	 as most significant bit (MSB) which indicates the status of a number i.e.
//	    	 the number is positive or negative. If the value of the sign bit is 0 then
//	    	 the number is positive; otherwise the number is negative, if the value of the 
//	    	 sign bit is 1.
	     
//	     The signed left shift ("<<") operator shifts a  bit (or bits) to the left by the 
//	     distance specified in the right operand. In this case, the leftmost digit is shifted at
//	     the end of the register, and a new 0 is shifted into the rightmost position. No matter, 
//	     the number is positive or negative; In both of case the leading bit position is always 
//	     filled with a zero.
	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );

//	     The signed right shift (">>") operator shifts a  bit (or bits) to the right by the 
//	     distance specified in the right operand and fills the left most bit by the sign bit.
//	     In this case the rightmost bit (or bits) is shifted out, and a new 0 is filled with the 
//	     sign bit into the high-order bits to the left position if the left operand is positive;
//	     otherwise 1, if the left operand is negative. This technique is known as sign extension.
	     c = a >> 2;     /* 15 = 1111 */
	     System.out.println("a >> 2  = " + c );

//	     The unsigned right shift operator ">>>" shifts a zero into the leftmost position,
	     c = a >>> 2;     /* 15 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	  }
}
