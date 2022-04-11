package string;
import java.util.*;
public class String_joiner {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter 
		StringJoiner joinNames1 = new StringJoiner(",", "[", "]"); 
		 // Adding values to StringJoiner 
		 joinNames.add("Rahul"); 
		 joinNames.add("Raju"); 
		 joinNames.add("Peter"); 
		 joinNames.add("Raheem"); 
		 
		 joinNames1.add("Rahul"); 
		 joinNames1.add("Raju"); 
		 joinNames1.add("Peter"); 
		 joinNames1.add("Raheem"); 
		 
		 System.out.println(joinNames+"\n\n");
		 System.out.println(joinNames1);
		 
		 //string merge
		 StringJoiner joinNames3 = new StringJoiner(",", "[", "]"); 
		 
		 // passing comma(,) and square -brackets as delimiter 
		  
		  // Adding values to StringJoiner 
		  
		  joinNames3.add("Rahul"); 
		  joinNames3.add("Raju"); 
		  
		  // Creating StringJoiner with :(colon) delimiter 
		  StringJoiner joinNames4 = new StringJoiner(":", "#", "#");
		 
		  // passing colon(:) and square -brackets as delimiter 
		  
		  // Adding values to StringJoiner 
		  joinNames4.add("Peter"); 
		  joinNames4.add("Raheem"); 
		  
		  // Merging two StringJoiner 
		  StringJoiner merge = joinNames.merge(joinNames4); 
		  System.out.println("\n\n"+merge);
		 
		 
		 
	}

}
