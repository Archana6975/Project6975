package java8package;

import java.util.function.Function;

public class Functionalinterface {
	
	public static void main(String[] args) 
	{
	 Function<String, Integer> fun = s -> s.length();
	 System.out.println(fun.apply("Hello"));
	 
	 int amount = 3;
	 Function<Integer, Integer> sum = i -> i + i; // 3 + 3 = 6
	 
	 Function<Integer, Integer> sq = i -> i * i; // 6 * 6 = 36
	 System.out.println(sum.apply(amount));
	 System.out.println(sq.apply(amount));//3
	
	 System.out.println(sum.andThen(sq).apply(amount)); //3(6) -> //6(36)
	
	 System.out.println(sum.compose(sq).apply(amount));
	 
	}
	}

