/*
Write a program that will have a Vector which is capable of storing emp objects. 
Use an Iterator and enumeration to list all the elements of the Vector.
 * */
package collection_assignment;
import java.util.Iterator;
import java.util.Vector;

class Employee_9 {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee_9(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Vector<Employee_9> list = new Vector<>();
		
		list.add(new Employee_9(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee_9(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee_9(103, "John", "345 street, India", 25000.0));
		list.add(new Employee_9(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Employee_9> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}