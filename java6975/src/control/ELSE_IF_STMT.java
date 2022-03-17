
package control;

import java.util.Scanner;

public class ELSE_IF_STMT {

	public static void main(String[] args) {
		int day;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day number between 0 - 6 ");
		day = s.nextInt();

		if(day == 0) {
			System.out.println("Today is Sunday");
		}

		else if(day == 1) {
			System.out.println("Today is Monday");
		}
		else if(day == 2) {
			System.out.println("Today is Tuesday");
		}
		else if(day == 3) {
			System.out.println("Today is Wednesday");
		}
		else if(day == 4) {
			System.out.println("Today is Thursday");
		}
		else if(day == 5) {
			System.out.println("Today is Friday");
		}
		else if(day == 6) {
			System.out.println("Today is saturday");
		}
		else {
			System.out.println("You Have Entered Wrong Value");
		}
	}

}
