package arrays;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		int[] Array1 = { 2345, 2378, 5678, 9876, 1234, 985, 4783 };
		String[] Array2 = { "people", "memory", "deaf", "dum", "computer", "laptop", "coding", "program" };

		System.out.println("The original numeric array :" + Arrays.toString(Array1) + "\n");
		Arrays.sort(Array1);
		System.out.println("The sorted numeric array :" + Arrays.toString(Array1) + "\n");

		System.out.println("The original string array :" + Arrays.toString(Array2) + "\n");
		Arrays.sort(Array2);
		System.out.println("The sorted string array :" + Arrays.toString(Array2));
	}

}
