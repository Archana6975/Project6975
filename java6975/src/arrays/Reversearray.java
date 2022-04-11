package arrays;

import java.util.*;

public class Reversearray {

	public static void main(String[] args) {
		int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("The original array:" + Arrays.toString(Arr));

		System.out.println("The reversed array:");

		for (int i = Arr.length - 1; i >= 0; i--) {

			System.out.print(Arr[i] + " ");
		}

	}

}
