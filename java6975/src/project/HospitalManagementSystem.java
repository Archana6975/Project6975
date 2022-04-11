//Hospital Management System Project

package project;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
	int id;
	String name;
	String diseasename;
	String address;
	long contact;
	long dischargebill;

	public Patient(int id, String name, String diseasename, String address, long contact, long dischargebill) {
		this.id = id;
		this.name = name;
		this.diseasename = diseasename;
		this.address = address;
		this.contact = contact;
		this.dischargebill = dischargebill;

	}

	public String toString() {
		return "\nPatient Details :" + "\nID:" + this.id + "\nName: " + this.name + "\ndiseasename: " + this.diseasename
				+ "\naddress: " + this.address + "\ncontact: " + this.contact + "\ndischargebill: "
				+ this.dischargebill;
	}

}

public class HospitalManagementSystem {

	static void display(ArrayList<Patient> list) {
		System.out.println("\n ..............Patient List...........\n");

		for (Patient e : list) {

			System.out.println("\nID:" + e.id + "\nName: " + e.name + "\ndiseasename: " + e.diseasename + "\naddress: "
					+ e.address + "\ncontact: " + e.contact + "\ndischargebill: " + e.dischargebill);
		}
	}

	public static void main(String[] args) {
		int id;
		String name;
		String diseasename;
		String address;
		long contact;
		long dischargebill;

		Scanner sc = new Scanner(System.in);
		ArrayList<Patient> al = new ArrayList<Patient>();

		do {
			System.out.println("\n*****Welcome to the Hospital Management System *****\n");
			System.out.println("1).Add Patient to the Database\n" + "2).Search for Patient\n"
					+ "3).Edit Patient details\n" + "4).Delete Patient details\n"
					+ "5).Display all Patients Admitted in the Hospital\n" + "6).Exit\n");
			System.out.println("Enter Your Choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the Following details to ADD a patient:\n");
				System.out.println("Enter Patient ID : ");
				id = sc.nextInt();
				System.out.println("Enter Name : ");
				name = sc.next();
				System.out.println("Enter Diseasename : ");
				diseasename = sc.next();
				System.out.println("Enter Address : ");
				address = sc.next();
				System.out.println("Enter Contact Detail : ");
				contact = sc.nextLong();
				System.out.println("Enter Discharge Bill Amount :  ");
				dischargebill = sc.nextLong();
				al.add(new Patient(id, name, diseasename, address, contact, dischargebill));
				display(al);
				break;

			case 2:
				System.out.println("Enter The Patient ID to search : ");
				id = sc.nextInt();
				int i = 0;
				for (Patient e : al) {
					if (id == e.id) {
						System.out.println(e + "\n");
						i++;
					}
				}

				if (i == 0) {
					System.out.println("\nPatient Details are not available,please enter a valid ID:");
				}
				break;

			case 3:
				System.out.println("\nEnter the Patient ID to EDIT the details ");
				id = sc.nextInt();
				int j = 0;
				for (Patient e : al) {
					if (id == e.id) {
						j++;
						do {
							int ch1 = 0;
							System.out.println("\nEDIT Patient Detail :\n" + "1).Patient ID\n" + "2).Name\n"
									+ "3).Diseasename\n" + "4).Address\n" + "5).Contact Detail\n"
									+ "6).Discharge Bill\n" + "7).GO BACK\n");
							System.out.println("Enter your choice : ");
							ch1 = sc.nextInt();
							switch (ch1) {
							case 1:
								System.out.println("Enter New Patient ID:");
								e.id = sc.nextInt();
								System.out.println(e + "\n");
								break;
							case 2:
								System.out.println("Enter New Patient Name:");
								e.name = sc.next();
								System.out.println(e + "\n");
								break;
							case 3:
								System.out.println("Enter New Patient Diseasename:");
								e.diseasename = sc.next();
								System.out.println(e + "\n");
								break;
							case 4:
								System.out.println("Enter New Patient Address:");
								e.address = sc.next();
								System.out.println(e + "\n");
								break;
							case 5:
								System.out.println("Enter New Patient Contact:");
								e.contact = sc.nextLong();
								System.out.println(e + "\n");
								break;
							case 6:
								System.out.println("Enter New Patient DischargeBill:");
								e.dischargebill = sc.nextLong();
								System.out.println(e + "\n");
								break;
							case 7:
								j++;
								break;
							default:
								System.out.println("\nEnter a correct choice from the List : ");
								break;

							}
							
						} while (j == 1);
						
					}
				}
				if (j == 0) {
					System.out.println("\nPatient Details are not available.please enter a valid ID:");
				}
				break;
			case 4:
				System.out.println("\nEnter Patient ID to DELETE from the Database : ");
				id = sc.nextInt();
				int k = 0;
				try {
					for (Patient e : al) {
						if (id == e.id) {
							al.remove(e);
							display(al);
							k++;
						}
						System.out.println("Patient detail of id " +id+ "deleted successfully\n");
					}
					
					if (k == 0) {
						System.out.println("\nPatient Details are not available.please enter a valid ID:");
					}
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 5: display(al);
				    break;

			case 6:
				System.out.println("\n You have chosen EXIT !! Saving files and Applicatin closed!!!. ");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("\n Enter a correct choice from the List : ");
				break;
			}
		}

		while (true);

	}
}