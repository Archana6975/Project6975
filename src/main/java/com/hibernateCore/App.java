package com.hibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Studentnew;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Studentnew student = new Studentnew();
		student.setRollno(02);
		student.setStudentName("Aruna");
		student.setStudentDept("Computer Application");
		student.setStudentContact("aruna@gmail.com");
		session.saveOrUpdate(student);
		transaction.commit();

	}
}
