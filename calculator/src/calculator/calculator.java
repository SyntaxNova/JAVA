package calculator;
import java.util.Scanner ;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		
		System.out.print("1 : Addition \n"
				+ "2 : subtraction \n"
				+ "3 : Multiplictaion \n"
				+ "4 : Division \n"
				+ "Enter Operation number : ");
		int operation = sc.nextInt();
		
		switch(operation) {
			case 1 :
				int sum = a+b;
				System.out.println("Addition is : "+ sum);
				break;
			case 2 :
				int sub = a-b;
				System.out.println("Subtraction is : "+ sub);
				break;
			case 3 :
				int mult = a*b;
				System.out.println("Multiplication is : "+mult);
				break;
			case 4 :
				int div = a/b;
				System.out.println("Division is : "+ div);
				break;
			default : 
				System.out.println(" invalid Choice ! ");
		}
	}

}
