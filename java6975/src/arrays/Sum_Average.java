package arrays;

public class Sum_Average {

	public static void main(String[] args) {
		int sum = 0;
		int array[] = { 3, 5, 7, 8, 10, 12, 15 };
		int length = array.length;
		System.out.println("The array elements are :");
		for (int element : array) {
			System.out.println(element);
		}

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];
		}
		System.out.println("\nThe sum of array :" + sum);
		double average = sum / length;

		System.out.println("The average of array :" + average);
	}

}
