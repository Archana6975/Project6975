package oops;

class library {

	library() {
		System.out.println("The constructor library class method");
	}

	int bookcount = 500;

	void display() {
		System.out.println("The super class method");

	}
}

	class Department extends library {

		Department() {
			System.out.println("The constructor Department class method");

			System.out.println("--------------------\n");
		}

		int bookcount = 200;

		void print() {
			System.out.println("the bookcount of libray :");
			System.out.println(super.bookcount);

			System.out.println("the bookcount of Department :");
			System.out.println(bookcount);
			System.out.println("--------------------\n");

		}

		void display() {
			super.display();
			System.out.println("The child class method");
		}
	}

public class Supervar {

	public static void main(String[] args) {

		Department d = new Department();
		d.print();
		d.display();
	}

}
