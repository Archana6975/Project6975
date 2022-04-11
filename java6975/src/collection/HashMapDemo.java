package collection;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map <String,String> m = new HashMap<String,String>();
m.put(null, null);
m.put("rishi", "advani");
m.put("Madhan","Kumar");
m.put("Karl"," marks");

System.out.println("The hash map values are : \n"+m);
 
for(Map.Entry p:m.entrySet()) {
	
	System.out.println(p.getKey()+"     "+p.getValue());	
}
System.out.println(m.containsKey("rishi"));
	}

}
