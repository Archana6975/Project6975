package arrays;

import java.util.Scanner;

public class Elementcheck {

	public static void main(String[] args) {
		int[] array_elements = { 5, 8, 6, 7, 10, 12, 14 };

		System.out.println("Enter the element to find");
		Scanner sc = new Scanner(System.in);
		int tofind = sc.nextInt();

		boolean is_found = false;

		for (int arr : array_elements) {
			if (arr == tofind) {
				is_found = true;

			}
		}
		if (is_found) {
			System.out.println("Value\t" + tofind + " is found.");
		} else {
			System.out.println("Value\t" + tofind + " is not found.");
		}
		sc.close();
	}

}
