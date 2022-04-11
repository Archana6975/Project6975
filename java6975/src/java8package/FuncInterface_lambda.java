package java8package;

@FunctionalInterface
interface Engine{
	
	public void square(int a); // abstract method
	
	default void show() // default method
	{
	System.out.println("Default Method Executed");
	}
	
	public static void display() //static method
	{
	System.out.println("This is java 8 static method ");
	}
	
}
public class FuncInterface_lambda implements Engine {

	public void square(int a)
	{
	System.out.println(a*a);
	}

	public static void main(String args[])
	{
		FuncInterface_lambda d = new FuncInterface_lambda();
	   
		d.square(4); // default method executed

	    d.show();
	    
	    Engine.display();
	}
}
