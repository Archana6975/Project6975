package constructors;

public class Rectangle {
	
	public Rectangle(){
		System.out.println("The Constructor......");
	}
	
	public Rectangle(int x){
		System.out.println("The value of x is :"+x);
	}
	
	public Rectangle(int length, int breadth) {
		
		int area = length*breadth;
		System.out.println("The area of rectangle is :"+area);
		
	}

	public static void main(String[] args) {
		
		Rectangle obj = new Rectangle();
		Rectangle obj1 = new Rectangle(50);
		Rectangle obj2 = new Rectangle(30,60);
	}

}
