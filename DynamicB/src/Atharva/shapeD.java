package Atharva;
import java.util.Scanner;

public class shapeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		shape triangle = new triangle();
		shape rectangle = new rectangle();
		
		System.out.print("Enter dimensions of triangle -> \n");
		triangle.inputdata();
		triangle.computearea();
		
		System.out.print("Enter dimensions of rectangle -> \n");
		rectangle.inputdata();
		rectangle.computearea();
		
	}

}
