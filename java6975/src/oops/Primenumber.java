package oops;

import java.util.Scanner;

public class Primenumber {
	public static void main(String args[]) {
		int i, j, n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("print the prime numbers from 1 to ...." + n);
		for (i = 1; i <= n; i++) {
			int count = 0;

			for (j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
