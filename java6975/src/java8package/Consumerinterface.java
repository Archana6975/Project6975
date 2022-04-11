package java8package;
import java.util.function.Consumer;

public class Consumerinterface {
	
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
	Consumer<String> con = s -> System.out.println(s.toUpperCase());
	 Consumer<String> con1 = s -> System.out.println("(" + s + ")");
	 con.andThen(con1).accept("Hello World");
	}
	}

