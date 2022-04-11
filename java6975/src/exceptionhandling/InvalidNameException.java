package exceptionhandling;

import java.util.Scanner;

class MyException extends Exception{
public MyException(String msg){
	super(msg);	
	}
}
class InvalidNameException {

	public static void main(String args[])throws MyException {
		
		InvalidNameException exp = new InvalidNameException();
		exp.mymethod();
	}
	void mymethod() throws MyException{
		
		String firstname,lastname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		firstname = sc.nextLine();
		System.out.println("Enter your Last Name");
		lastname = sc.nextLine();
		
		if(firstname.equals("") && lastname.equals("")) {
			
			throw new MyException("Invalid");
		}
		else {
			System.out.println(firstname+" "+lastname);
			System.out.println("Program run Successfully");
		}
		}
		
		
	}



