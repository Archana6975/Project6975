package java8package;

import java.util.function.Supplier;
public class Supplierclass
{
public static void main(String[] args) 
{

Supplier<Double> sup= () -> Math.random();
System.out.println(sup.get());
}
}
