package arrays;
import java.util.*;
public class Secondlarge {

		   public static void main(String args[]){
		   
			   int[] array = new int[5];
				Scanner scan = new Scanner(System.in);

				System.out.print("Enter  " + array.length + "  Elements:\n");
				for (int i = 0; i < array.length; i++)
					array[i] = scan.nextInt();

			   
		    Arrays.sort(array);
		      System.out.println("second largest number is:: "+array[array.length-2]);
		   }
		}