package oops;

	class BaseClass 
	{ 
	    void display()      //no access modifier indicates default modifier
	       { 
	           System.out.println("BaseClass:Display with 'default' scope"); 
	       } 
	} 
	 
	class Default 
	{ 
	    public static void main(String args[]) 
	       {   
	          //access class with default scope
	          BaseClass obj = new BaseClass(); 
	   
	          obj.display();    //access class method with default scope
	       } 
	}
