package java8package;

import java.util.*;
import java.util.stream.*;

public class Streamapi {

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
System.out.println(li);

//WAP to take out List where number greater than 20
List<Integer>collect = li.stream().filter(i->i>20).collect(Collectors.toList());
System.out.println(collect);

//wap to take out final list where we are adding 5 to each element
List<Integer>collect2 = li.stream().map(i->i+5).collect(Collectors.toList());
System.out.println(collect2);

System.out.println("-------------------------------------------");

//Terminal Operation

//1.toArray()

Stream<Integer> s = Stream.of(1,2,3,4,5,6);
Object[] array = s.toArray();

for(Object a:array)
{
	System.out.println(a);
}

//count()
Stream<Integer> s6 = Stream.of(1,2,3,4,5,6);
long count = s6.count();
System.out.println(count);

//forEach
Stream<Integer>s1=Stream.of(3,4,5,6,7,8);
s1.forEach(ele->System.out.println(ele));

//minimum
Stream<Integer>s3 = Stream.of(91,62,3,54,5);
Integer min=s3.min(Comparator.comparing(Integer::valueOf))
.get();

System.out.println("min :"+min);

//max
Stream<Integer>s4 = Stream.of(91,62,3,54,5);
Integer max=s4.max(Comparator.comparing(Integer::valueOf)).get();

System.out.println("max :"+max);

List<String> list = Arrays.asList("gee", "fee", "bee","kee", "lee");


//map
List<String> answer = list.stream().map(String::toUpperCase).
collect(Collectors.toList());

// displaying the new stream of UpperCase Strings
System.out.println(answer);

//sorted
list.stream().sorted().forEach(System.out::println);



	}

}
