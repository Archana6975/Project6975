package exceptionhandling;

public class TryCatchexcep {

	public static void main(String[] args) {
		System.out.println("Welcome Learner!!!");
		try {
			int n, a = 5, b = 0;
			n = a / b;
			System.out.println("The divide value is :" + n);
		} catch (Exception e) {
			System.out.println("Exception has occured");

		}
		
		finally {
			System.out.println("Method finally has occured");
		}
	}

}
