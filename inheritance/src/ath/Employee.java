package ath;

public class Employee {
	 	protected String empName;
	    protected int empId;
	    protected String address;
	    protected String mailId;
	    protected String mobileNo;
	    
	    public Employee(String empName, int empId, String address, String mailId, String mobileNo) {
	        this.empName = empName;
	        this.empId = empId;
	        this.address = address;
	        this.mailId = mailId;
	        this.mobileNo = mobileNo;
	    }
	    public void displayDetails() {
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + empName);
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Address: " + address);
	        System.out.println("Mail ID: " + mailId);
	        System.out.println("Mobile Number: " + mobileNo);
	    }
}
class programmer extends Employee{
	double basicPay;
	
	programmer(String empName,int empId,String address,String mailId,String mobileNo, double basicpay){
		super(empName,empId,address,mailId,mobileNo);
		this.basicpay=basicpay;
	}
	public void generatePaySlip() {
	double da = 0.97 * basicPay;
    double hra = 0.1 * basicPay;
    double pf = 0.12 * basicPay;
    double staffClubFund = 0.001 * basicPay;

    double grossSalary = basicPay + da + hra;
    double netSalary = grossSalary - pf - staffClubFund;
	}
}
