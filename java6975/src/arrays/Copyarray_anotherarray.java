package arrays;

import java.util.Scanner;

public class Copyarray_anotherarray {

	public static void main(String[] args) {

		int arr[] = new int[5];
		int copyarr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the " + arr.length + " elements :");

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("\n\nThe original Array : \n");
		for (int i = 0; i < arr.length; i++) {
			copyarr[i] = arr[i];
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n\nThe copied array :\n");
		for (int i = 0; i < copyarr.length; i++) {
			System.out.print(copyarr[i] + "\t");
		}

	}

}
