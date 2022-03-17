
package control;

import java.util.Scanner;

public class SWITCH_STMT {

	public static void main(String[] args) {
		int day;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day number between 0 - 6 ");
		day = s.nextInt();

	    switch(day)
	    {
	    case 1:
			System.out.println("Today is Sunday");
		    break;
		    
	    case 2:
		 
			System.out.println("Today is Monday");
		    break;
	    case 3:
			System.out.println("Today is Tuesday");
		     break;
	    case 4:

			System.out.println("Today is Wednesday");
		     break;
	    case 5:

		System.out.println("Today is Thursday");
	     break;
	    case 6:

		System.out.println("Today is Friday");
	     break;
	    case 7:

		System.out.println("Today is Saturday");
	     break;
	     
		default : 
			System.out.println("You Have Entered Wrong Value");
	    }
		
	}

}
