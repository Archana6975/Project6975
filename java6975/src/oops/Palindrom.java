package oops;
import java.util.Scanner;

public class Palindrom
{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n,rev=0,original,rem;
		System.out.println("Enter the Value");
		n=sc.nextInt();
		original = n;
		while(n!=0)
		{
		rem = n%10;
		rev = (rev*10)+rem;
		n=n/10;

		}
		if (rev==original){
		System.out.println("value is palindrom");
		}
		else{
		System.out.println("Value is not a palindrome");
		}

	}
}
