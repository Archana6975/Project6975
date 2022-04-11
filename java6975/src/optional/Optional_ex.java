package optional;

import java.util.Optional;

public class Optional_ex {
	public static void main(String[] args) {

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";
		str[3]="abc";
		
		System.out.println("Empty Method");
		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		System.out.println("\n\n of Method");
		// It returns a non-empty Optional
		
		Optional<String> value = Optional.of(str[3]);
		System.out.println(value);

		System.out.println("\n\nofNullable Method");
		
		String[] words = new String[10];
		
		Optional<String> checkNull = Optional.ofNullable(words[9]);

	
		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");

		System.out.println("\n\nget Method");
	
		// It returns value of an Optional.
		// If value is not present, it throws
		// an NoSuchElementException
	
		System.out.println(value.get());

		System.out.println("\n\nhashCode Method");
		
		// It returns hashCode of the value
		
		System.out.println(value.hashCode());
		
		// It returns true if value is present,
        // otherwise false
		System.out.println("\n\n isPresent Method");
        System.out.println(value.isPresent());

		

		/*
		 * Instead of directly getting the value using get() method, first, it checks
		 * the condition value != null. In this program, Creating an Optional instance
		 * which is a type of List //as listOptional. Now, Calling
		 * listOptional.ifPresent() method that takes the Consumer.
		 */
		Optional<String> statement = Optional.ofNullable("abc");
		
		statement.ifPresent(value1 -> System.out.println(value1.toUpperCase()));

	}

}
