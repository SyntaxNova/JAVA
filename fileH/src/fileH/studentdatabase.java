package fileH;
import java.io.*;
import java.util.*;
public class studentdatabase {
	static final String DATABASE_FILE = "student_database.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\nStudent Database Management System");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Delete Record");
            System.out.println("4. Update Record");
            System.out.println("5. Search Record");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
            case 1:
            	createdatabase();
                break;
            case 2:
                displayDatabase();
                break;
            case 3:
                System.out.println("Delete Record option is not implemented in this example.");
                break;
            case 4:
                System.out.println("Update Record option is not implemented in this example.");
                break;
            case 5:
                searchRecord();
                break;
            case 6:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
            	System.out.println("Invalid choice. Please enter a valid option.");
            }
		}while(choice != 6);
	}
	static void createdatabase() {
		try(PrintWriter writer = new PrintWriter(new FileWriter(DATABASE_FILE, true))){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Student ID: ");
            String studentId = scanner.next();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Roll No: ");
            String rollNo = scanner.next();
            System.out.print("Enter Class: ");
            String studentClass = scanner.next();
            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            System.out.print("Enter Address: ");
            String address = scanner.next();
            Student student = new Student(studentId, name, rollNo, studentClass, address, marks);
            writer.println(student.studentId + "," + student.name + "," + student.rollNo + "," +
                            student.studentClass + "," + student.marks + "," + student.address);
            System.out.println("Record added successfully.");
		}catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
	}

}
