package arrays;

import java.util.Scanner;

public class Bubblesort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
        int count=0;
		int arr[] = new int[5];
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the " + arr.length + " elements :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt();
		} 
		
		System.out.println("The elements of array displayed are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n\nEnter the element of array to be searched :");
		int n = r.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		if (count==1)
	System.out.println("The element is found ");
	else 
		System.out.println("The element is not found ");
	
	
		bubbleSort(arr);//sorting array elements using bubble sort  
        
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
	}
	
	}
}
