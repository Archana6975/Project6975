package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Rahul");
		list.add("Tharun");
		list.add("Varun");
		list.add("Ramen");
		list.add("Tharun");
		list.add("Varun");
		list.add("Ramen");

		System.out.println("The Linked List is :" + list);
		System.out.println("The Size of List is :" + list.size());

		Collections.sort(list);
		System.out.println("The Sorted List is :" + list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
