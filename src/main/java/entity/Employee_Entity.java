package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee_Entity {

	@Id
	private int EmployeeId;
	
	@Column(nullable = false, length = 30)
	private String EmployeeName;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee_Entity [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]";
	}

	public Employee_Entity(int employeeId, String employeeName) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
	}

	public Employee_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}


