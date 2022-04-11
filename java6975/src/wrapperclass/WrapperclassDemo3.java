package wrapperclass;

public class WrapperclassDemo3 {

	public static void main(String[] args) {
		// AutoBoxing

		int a = 100;// primitive to wrapper it is done automatically
		Integer b = a;
		System.out.println("Auto boxing : " + b);

		// Boxing manually by using method

		int x = 90;
		Integer y = Integer.valueOf(x);
		System.out.println("Boxing : " + y);

		// Unboxing object wrapper class to primitive type
		// manual
		Integer result = 100;
		int newerResult = result.intValue();
		System.out.println("Unboxing : " + newerResult);

		// auto
		Integer marks = 78;
		int newermarks = marks;
		System.out.println("Auto Unboxing : " + newermarks);

	}

}
