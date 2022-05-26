package mappingmanytomany;

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
		
		Doctor doctorinfo1 = new Doctor();
		doctorinfo1.setDoctorId(1);
		doctorinfo1.setDoctorName("Archana");
		
		Doctor doctorinfo2 = new Doctor();
		doctorinfo2.setDoctorId(2);
		doctorinfo2.setDoctorName("Aravindh");
		
		List<Doctor> doctorList = new ArrayList<Doctor>();
		doctorList.add(doctorinfo1);
		doctorList.add(doctorinfo2);
		
		Patient patient1 = new Patient();
		patient1.setPatientId(101);
		patient1.setPatientName("Aruna");
		patient1.setDoctors(doctorList);
		
		Patient patient2 = new Patient();
		patient2.setPatientId(102);
		patient2.setPatientName("Krishna");
		patient2.setDoctors(doctorList);
		
		List<Patient> patientList = new ArrayList<Patient>();
		patientList.add(patient1);
		patientList.add(patient2);
		
		doctorinfo1.setPatient(patientList);
		doctorinfo2.setPatient(patientList);
		
		session.saveOrUpdate(doctorinfo1);
		session.saveOrUpdate(doctorinfo2);
		
		transaction.commit();
		

	}

}
