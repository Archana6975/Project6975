package collection_assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee_0 {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee_0(int id, String name, String address, Double salary) {
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

public class Searchusingempid {

	public static void main(String[] args) {
		List<Employee_0> list = new ArrayList<>();
		
		list.add(new Employee_0(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee_0(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee_0(103, "John", "345 street, India", 25000.0));
		list.add(new Employee_0(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Employee_0> it = list.iterator();
		int searchId = 103;
		while (it.hasNext()) {
			Employee_0 emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}