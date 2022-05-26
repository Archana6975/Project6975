package restrictionscriteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		EmployeeFile employee1 = new EmployeeFile();
		employee1.setEmployeeId(101);
		employee1.setEmployeeName("Archana");
		employee1.setEmployeeAddress("Chennai");
		
		EmployeeFile employee2 = new EmployeeFile();
		employee2.setEmployeeId(102);
		employee2.setEmployeeName("Arjun");
		employee2.setEmployeeAddress("Delhi");
		
		EmployeeFile employee3 = new EmployeeFile();
		employee3.setEmployeeId(103);
		employee3.setEmployeeName("Aravindh");
		employee3.setEmployeeAddress("Chennai");
		
		EmployeeFile employee4 = new EmployeeFile();
		employee4.setEmployeeId(104);
		employee4.setEmployeeName("May");
		employee4.setEmployeeAddress("Pune");
		
		/*
		 * session.saveOrUpdate(employee1); session.saveOrUpdate(employee2);
		 * session.saveOrUpdate(employee3); session.saveOrUpdate(employee4);
		 * 
		 * transaction.commit();
		 */
		Criteria criteria = session.createCriteria(EmployeeFile.class);
		
		criteria.setProjection(Projections.property("EmployeeName"));
		
		List list = criteria.list();
		
		System.out.println("Employee_Name from table EmployeeFile :");
		System.out.println(list);
		
		
	}

}
