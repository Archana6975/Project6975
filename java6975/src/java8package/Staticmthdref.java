package java8package;

interface Motor
{
 abstract public void speed(); 
}
class Car
{
 public static void average()
 {
 System.out.println("The averge of the car is very Good");
 }
}
public class Staticmthdref
{
public static void main(String[] args) 
{
// Using Lambda expression
	Motor obj = ()->System.out.println("Speed is Good");
 obj.speed();

 // Lambda replaced with static method Reference
 Motor obj1= Car::average;
 obj1.speed();
}
}
