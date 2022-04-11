
// Write a Java program to print after removing duplicates from a given string.

package string;
import java.lang.*;
public class StrAssignduplicateremove {

	public static void main(String[] s) {
		String str = "Java Java Full Stack Development";
		System.out.println("Old String is :"+str);
		
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			
		char ch =str.charAt(i);
		int idx = str.indexOf(ch,i+1);
		if(idx==-1) {
			sb1.append(ch);
		}
			
		}
		
		System.out.println("New String is :"+sb1);
		

	}
	

}
