package Atharva;
import java.util.*;
public class Complex1 {
	int real,imag;
	
	Complex1(){
		this.real=0;
		this.imag=0;
	}
	Complex1(int real, int imag){
		this.real = real;
		this.imag= imag;
	}
	Complex1 add (Complex1 c1 ,Complex1 c2) {
		Complex1 temp = new Complex1();
		temp.real = c1.real + c2.imag ;
		temp.imag = c1.imag + c2.imag ;
		return temp ;
	}
	Complex1 Subtract (Complex1 c1 ,Complex1 c2) {
		Complex1 temp = new Complex1();
		temp.real = c1.real - c2.imag ;
		temp.imag = c1.imag - c2.imag ;
		return temp ;
	}
	Complex1 Multiply (Complex1 c1 ,Complex1 c2) {
		Complex1 temp = new Complex1();
		temp.real = c1.real*c2.real + (c2.imag*c1.imag*(-1)) ;
		temp.imag = c1.imag*c2.real + c2.imag*c1.real ;
		return temp ;
	}
	static void Display(Complex1 c) {
		System.out.print(c.real + " + " + c.imag + "i \n" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Real part First Complex Number -> : ");
		int real1 = scanner.nextInt();
		System.out.print("imaginary part First Complex Number -> : ");
		int imag1 = scanner.nextInt();
		Complex1 c1 = new Complex1(real1,imag1);
		
		
		System.out.print("Real part Second Complex Number -> : ");
		int real2 = scanner.nextInt();
		System.out.print("imaginary part Second Complex Number -> : ");
		int imag2 = scanner.nextInt();
		Complex1 c2 = new Complex1(real2,imag2);
		
		System.out.print("First Complex Number is : ");
			Display(c1);
		System.out.print("Second Complex Number is : ");
			Display(c2);
		
		Complex1 Addition = c1.add(c1, c2);
		Complex1 Subtraction = c1.Subtract(c1, c2);
		Complex1 Multiplication = c1.Multiply(c1,c2);
		
		System.out.print("Addition is : ");
			Display(Addition);
		System.out.print("Subtraction is : ");
			Display(Subtraction);
		System.out.print("Multiplication is : ");
			Display(Multiplication);
	}

}
