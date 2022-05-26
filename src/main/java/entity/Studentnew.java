package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studentnew {

	@Id
	private int rollno;

	@Column(nullable = false, length = 30)
	private String studentName;

	@Column(nullable = false, length = 30)
	private String studentDept;

	@Column(nullable = false, length = 30)
	private String studentContact;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	@Override
	public String toString() {
		return "Studentnew [rollno=" + rollno + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentContact=" + studentContact + "]";
	}

	public Studentnew(int rollno, String studentName, String studentDept, String studentContact) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentContact = studentContact;
	}

	public Studentnew() {
		super();
		// TODO Auto-generated constructor stub
	}

}
