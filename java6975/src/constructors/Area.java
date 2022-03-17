package constructors;

public class Area {
	public Area(int a) {
		
		int area = a*a;
		System.out.println("The side value is :"+a);
		System.out.println("The area of square is : " +area);
		}
	
	
public Area(int l, int b) {
	System.out.println("\n------------------------------------");
		
		int area = l*b;
		System.out.println("The length value is :"+l);
		System.out.println("The breadth value is :"+b);
		System.out.println("The area of rectangle is : " +area);
		}
public Area(double pi, int r) {
	System.out.println("\n------------------------------------");
	
	double area = pi*r*r ;
	System.out.println("The radius of circle is :"+r);
	System.out.println("The area of Circle is : " +area);
	}

	public static void main(String[] args) {
		Area obj1 = new Area(10);
		Area obj2 = new Area(20,30);
		Area obj3 = new Area(3.14, 10);
		

	}

}
