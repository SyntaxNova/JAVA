package Atharva;
import java.util.*;
public class Complex {
	
	int real , imag ;
	
	Complex(){									// Constructor
		this.real=0;
		this.imag= 0;
	}
										
	Complex(int real, int imag){				//Parameterized Constructor
		this.real=real ;
		this.imag= imag ;
	}
	
	Complex add (Complex c1, Complex c2) { 	
		Complex temp = new Complex() ;
		temp.real = c1.real +c2.real ;
		temp.imag = c1.imag + c2.imag ;
		return temp ;
	}
	
	Complex subtract (Complex c1 , Complex c2) { 	
		Complex temp = new Complex() ;
		temp.real = c1.real +c2.real ;
		temp.imag = c1.imag + c2.imag ;
		return temp ;
	}
	
	Complex Multiply (Complex c1, Complex c2) { 	
		Complex temp = new Complex() ;
		temp.real = c1.real*c2.real + (c1.imag * c2.imag)*(-1) ;
		temp.imag =  c1.real*c2.imag + c1.imag*c2.real;
		return temp ;
	}
	static void displayComplex(Complex c) {
        System.out.println(c.real + " + " + c.imag + "i");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("real part of the first complex number: ");
		int real1 = scanner.nextInt();
		System.out.print("imaginary part of the first complex number: ");
		int imag1 = scanner.nextInt();
		Complex c1 = new Complex( real1 , imag1);
		
		System.out.print("real part of the Second complex number: ");
		int real2 = scanner.nextInt();
		System.out.print("imaginary part of the Second complex number: ");
		int imag2 = scanner.nextInt();
		Complex c2 = new Complex( real2 , imag2);
		
		System.out.print("First Complex is : ");
		displayComplex(c1);
		System.out.print("Second Complex is : ");
		displayComplex(c2);
		
		
		Complex Addition = c1.add(c1,c2);
		Complex Subtraction = c1.subtract(c1,c2);
		Complex Multiply = c1.Multiply(c1, c2);
		
		System.out.print("Addition is : " );
		displayComplex(Addition);
		System.out.print("Subtraction is : " );
		displayComplex(Subtraction);
		System.out.print("Multiplication is : " );
		displayComplex(Multiply);
		
	}

}
