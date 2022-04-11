package arrays;

import java.util.Scanner;

public class Deleteelement {
	public static void main(String[] args) {
		int i, j, size = 5, element;
		int[] arr = new int[size];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter  " + size + "  Elements:\n");
		for (i = 0; i < size; i++)
			arr[i] = scan.nextInt();

		System.out.print("Enter the Element to Remove: ");
		element = scan.nextInt();

		for (i = 0; i < size; i++) {
			if (element == arr[i]) {
				for (j = i; j < (size - 1); j++) 
					arr[j] = arr[j + 1];
					System.out.println("\nRemoved the element successfully!");
					break;
				}
			}
		 System.out.println("\nThe new array is: ");
	      for(i=0; i<(size-1); i++)
	         System.out.print(arr[i]+ " ");
		}
	}
