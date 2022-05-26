package mappingonetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
	
		Faculty faculty = new Faculty();
		faculty.setFacultyId(1);
		faculty.setFacultyName("Aruna");
		
		Student studentinfo1 = new Student();
		studentinfo1.setStudentId(101);
		studentinfo1.setStudentName("Barathi");
		studentinfo1.setFaculty(faculty);
		
		Student studentinfo2 = new Student();
		studentinfo2.setStudentId(102);
		studentinfo2.setStudentName("Archana");
		studentinfo2.setFaculty(faculty);
		
		List <Student>studentlist = new ArrayList<Student>();
		studentlist.add(studentinfo1);
		studentlist.add(studentinfo2);
		session.saveOrUpdate(faculty);
		session.saveOrUpdate(studentinfo1);
		session.saveOrUpdate(studentinfo2);
		transaction.commit();
		
	}
}
