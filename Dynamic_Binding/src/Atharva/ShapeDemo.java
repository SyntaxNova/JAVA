package Atharva;
import java.util.Scanner;
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Shape triangle = new triangle();
		Shape rectangle = new rectangle();
		
		System.out.print("Enter Dimensions for triangle -> \n");
		triangle.inputData();
		triangle.computearea();
		
		System.out.print("Enter Dimensions for rectangle -> \n");
		rectangle.inputData();
		rectangle.computearea();
	}

}
