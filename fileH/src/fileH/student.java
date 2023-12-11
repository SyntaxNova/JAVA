package fileH;

public class Student {
	String studentId, name, rollNo, studentClass, address;
	double marks;
	
	Student(String studentId, String name,String rollNo,String studentClass,String address , double marks){
		this.studentId=studentId;
		this.name = name;
        this.rollNo = rollNo;
        this.studentClass = studentClass;
        this.marks = marks;
        this.address = address;
	}
}
