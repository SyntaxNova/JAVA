package Functions;
import java.util.Scanner;
public class FunctionsDSA {

public static void printmyname(String name) {
	System.out.print(name);	
	return ;
}

public static int add(int a,int b) {
	return a+b;
}

public static int mult(int a, int b ) {
	return a*b ; 
}

public static void factorial(int a ) {
	int fact = 1;
	if(a<0) {
		System.out.print("invalid number!");
		return ;
	}
	for(int i = a ; i>=1 ; i--) {
		fact = fact*i;
	}
	System.out.print("Factorial of "+a+" is : "+ fact);
	return ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//returntype function_name(type arg1 , type arg2){Operation}
		Scanner sc = new Scanner(System.in);

		//String name = sc.next();
		//printmyname(name); //call function
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Sum of two num : "+add(a,b));
		
		System.out.println("Multiplication of two num : "+mult(a,b));
		
		factorial(a);
		
		
	}
	

}
