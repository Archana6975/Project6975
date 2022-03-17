package inheritance;

class WildAnimal {
	{
		int x = 20;
		System.out.println("Print the value of x" + x);
	}

	public void nature() {

		System.out.println("The nature of animals is wild");

		System.out.println("--------------------\n");
	}

}

class Domestic extends WildAnimal {

	{
		int y = 30;
		System.out.println("Print the value of Y" + y);
		System.out.println("--------------------\n");
	}

	public void nature() {
		
		

		System.out.println("The nature of domestic animal is non violent");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Domestic obj = new Domestic();
		obj.nature();

	}

}
