package java8package;

interface Engine10
{
 abstract public void speed(); 
}
class Car1
{
 public void wheel()
 {
 System.out.println("Car has wheels of MRF company");
 }
}
public class Instancemthdref
{
public static void main(String[] args) 
{
// Using Lambda expression
	Engine10 obj = ()->System.out.println("Speed is Good");
 obj.speed();
// Lambda replaced with instance method Reference
Car1 car = new Car1();
Engine10 obj4=car::wheel;
}
}
