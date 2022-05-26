package restrictionscriteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeFile {

	@Id
	private int EmployeeId;
	
	@Column(nullable = false, length = 30)
	private String EmployeeName;
	
	@Column(nullable = false, length = 30)
	private String EmployeeAddress;

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

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "EmployeeFile [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAddress="
				+ EmployeeAddress + "]";
	}

	public EmployeeFile(int employeeId, String employeeName, String employeeAddress) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAddress = employeeAddress;
	}

	public EmployeeFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
