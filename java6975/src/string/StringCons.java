package string;

public class StringCons {

	public static void main(String[] args) {
		String s = "java Language";
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String s1 = new String(c);
		String s2 = new String("example");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);

		// charAt method
		System.out.println("The letter from index of string is :");
		System.out.println(s.charAt(3));

		// Concat methods
		System.out.println("The string after concat is :");
		System.out.println(s.concat(" Programming"));

		// equalsIgnoresCase

		System.out.println(s.equalsIgnoreCase("java Language"));

		// length()

		System.out.println(s1.length());

		// replace()

		System.out.println(s.replace('j', 'J'));

		// toLowerCase()

		System.out.println(s.toLowerCase());

		// toUpperCase()

		System.out.println(s.toUpperCase());

		// trim()

		System.out.println(s.trim() + "programming");

		// split()
		String b = "Welcome in Edubridge academy";
		String str[] = b.split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		
		//boolean ends with string suffix
		System.out.println(s.endsWith("age"));
		
		//boolean starts with string suffix
		System.out.println(s.startsWith("java"));
		
		//substring
		System.out.println(s.substring(3,13));
		
		
		//indexOf()
				System.out.println(s.indexOf('a'));
		
		
				//lastindexOf()
				System.out.println(s.lastIndexOf('a'));
				
				
				
		
	}

}
