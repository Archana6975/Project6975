package operators;

public class Bitwise {

	public static void main(String[] args) {
		int a = 5; 
		int b = 7; 
		// bitwise and, or, xor 
		 
		 System.out.println("a&b = " + (a & b)); 
		 System.out.println("a|b = " + (a | b));
		 System.out.println("a^b = " + (a ^ b));
		 
		 //
		 System.out.println("~a = " + ~a); 
		 System.out.println("~b = " + ~b); 
		 
		 a &= b; 
		 System.out.println("a= " + a); 
	}

}
