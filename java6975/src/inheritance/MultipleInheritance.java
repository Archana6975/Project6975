package inheritance;

interface A{
 static final int x  = 10;
 void display();
 void show();
	
}

interface B{
	static final int x = 20;
	void display();
	void show();
	public default void computer(){
		//to define method in interface
	}
	public static void laptop() {
		//to define method in interface
	}
}

class car{
	public void speed() {
		System.out.println("The Speed of the car is : 60km");
	}
	public void show() {
		System.out.println("The show method for class car");
	}
}

public class MultipleInheritance extends car implements A,B

{

	public static void main(String[] args) {
		
		MultipleInheritance obj = new MultipleInheritance();
		
		obj.display();
		obj.show();
		obj.speed();
		

	}

	@Override
	public void display() {
		System.out.println("The value of x is :"+A.x);
		System.out.println("The value of x is :"+B.x);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Thus program executed the show  method of interface");
		
		
	}
	
}
