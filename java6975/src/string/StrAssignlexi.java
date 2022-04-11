package string;

//Write a Java program to compare two strings lexicographically, ignoring case differences2. 
//Write a java program to convert given string in lower and upper case.

public class StrAssignlexi {

	public static void main(String[] args) {
		String s1 = "I Love Coding";
		String s2 = "I Love Coding";
		String s3 = "I Like Coding";
		
		System.out.println(s1.compareTo(s2));	
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

}
