package string;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "Sachin";
		
		String s2 = "Sachin";
		
		String s3 = new String("Sachin");
		
		String s4 = "Saurav";
		
		String s5="Ratan"; 
		
		//using equals method
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		//using compare by == operator
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		
		 //using compare to () operator 
	     System.out.println(s1.compareTo(s2)); // 0 
		 System.out.println(s1.compareTo(s4)); // -18
		 System.out.println(s4.compareTo(s5));//1

		 
	}

}
