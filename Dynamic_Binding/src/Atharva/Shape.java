package Atharva;
import java.util.Scanner;
public abstract class Shape {
	double dimension1;
	double dimension2;
	
	public abstract void computearea();
	
	void inputData() {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter Dimension1 : ");
		dimension1 = scanner.nextDouble();
		System.out.print("Enter Dimension2 : ");
		dimension2 = scanner.nextDouble();
	}
}
class triangle extends Shape{
	@Override
	public void computearea(){
		double area = (0.5) * dimension1 * dimension2 ;
		System.out.print("Area of Triangle : " + area + "\n");
	}
}
class rectangle extends Shape{
	@Override
	public void computearea() {
		double area = dimension1 * dimension2 ;
		System.out.print("Area of rectangle : " + area);
	}
}
