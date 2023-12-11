package Atharva;
import java.util.Scanner;
public abstract class shape {
	double dim1;
	double dim2;
	
	public abstract void computearea();
	
	public void inputdata() {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter Dimensions : \n");
		dim1 = scanner.nextDouble();
		dim2 = scanner.nextDouble();
	}
}
class triangle extends shape{
	@Override
	public void computearea() {
		double area = 0.5 * dim1 * dim2 ;
		System.out.print("Area of triangle : " + area + "\n");
	}
	
}
class rectangle extends shape{
	@Override
	public void computearea() {
		double area = dim1*dim2;
		System.out.print("Area of rectangle : " + area + "\n");
		
	}
}
