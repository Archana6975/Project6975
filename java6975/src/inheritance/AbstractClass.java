package inheritance;

abstract class F {

	abstract void output();

	void input() {
		int x = 10 + 5;
		System.out.println("Print the sum value :" + x);
		System.out.println("\n--------------------------\n\n");
	}

	F() {

		System.out.println("This is constructor of abstract class");
		System.out.println("\n--------------------------\n\n");
	}

}

class G extends F {

	void output() {
		System.out.println("The sum value has been printed successfully ");

	}
}

public class AbstractClass {

	public static void main(String[] args) {

		G obj = new G();
		obj.input();
		obj.output();
	}
}
