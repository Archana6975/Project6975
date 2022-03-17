package oops;

class Addition {
	static int calculation(int x, int y) {
		return x + y;

	}

	static double calculation(double x, double y) {
		double sub = x - y;
		return sub;

	}
}

	class Multiple {

		public void tocalculate(int side) {

			int sq = side * side;
			System.out.println("The value of square:" + sq);

		}

		public void tocalculate(int l, int b) {

			int rec = l * b;
			System.out.println("The value of rectangle is :" + rec);

		}
	}

public class MethdOverloading {

	public static void main(String[] args) {
		
		System.out.println(Addition.calculation(10,20));
		System.out.println(Addition.calculation(20.5,10.5));
		Multiple obj6 = new Multiple();
		obj6.tocalculate(10);
		obj6.tocalculate(15,20);
	}
}
