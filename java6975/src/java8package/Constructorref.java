package java8package;

interface Engine001
{
 abstract public void speed(); 
}
class Car001
{
 public Car001()
 {
 System.out.println("This is constructor of Car");
 }
}
public class Constructorref
{
public static void main(String[] args) 
{
// Using Lambda expression
 Engine001 obj = ()->System.out.println("Speed is Good");
 obj.speed();
// Lambda replaced with constructor method Reference
Engine001 obj4=Car001::new;
 obj4.speed(); 
 }
}


