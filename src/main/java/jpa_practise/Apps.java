package jpa_practise;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee_Entity;
public class Apps {

	public static void main(String[] args) {
	
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernateCore");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			Employee_Entity student1=new Employee_Entity();
			student1.setEmployeeId(121);
			student1.setEmployeeName("Barathi");
			
			
			Employee_Entity student2=new Employee_Entity();
			student2.setEmployeeId(122);
			student2.setEmployeeName("Archana");
			
			entityManager.persist(student1);
			entityManager.persist(student2);
			entityManager.getTransaction().commit();
			entityManagerFactory.close();
			entityManager.close();
			
	}

}
