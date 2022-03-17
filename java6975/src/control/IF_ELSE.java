package control;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) 
	{
		int marks;
		Scanner result = new Scanner(System.in);
		System.out.println("Enter your marks");
		marks = result.nextInt();
		
		if(marks>=35) {
			System.out.println("You have Passed");
		
		}
		
		else {
			System.out.println("You Have Not Passed");
		}
			
	   result.close();
	  
		
		
		

	}

}
