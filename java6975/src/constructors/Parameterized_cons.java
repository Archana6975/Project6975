package constructors;

public class Parameterized_cons {
	 int id; 
	 String name;
	  
	 Parameterized_cons(int id,String name) 
	 { 
	 this.id = id; 
	 this.name = name; 
	 } 
	 
	 void display() 
	 {
	 System.out.println(id+" "+name);
	 } 
	 
	 public static void main(String args[])
	 { 
	
		 Parameterized_cons s1  = new Parameterized_cons(111,"Karan");
		 Parameterized_cons s2 = new Parameterized_cons(222,"Aryan"); 
	
	 s1.display(); 
	 s2.display(); 
	 } 
	}


