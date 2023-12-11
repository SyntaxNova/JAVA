package Atharva;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			int num1= Integer.parseInt(scanner.nextLine());
			int num2= Integer.parseInt(scanner.nextLine());
			
			int division = dividenum(num1,num2);
			System.out.print("Result num1/num2 : " + division + "\n");
			
			int[] array = new int[5];
			int value = array[10];
			
		}catch(NumberFormatException e) {
			System.out.print("NumberFormat exception , enter valid int");
		}catch(ArithmeticException e) {
			System.out.print("Atirhmatic exception , enter valid int");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Array Index Out Of Bounds Exception , enter valid int");
		}
	}
	public static int dividenum(int num1,int num2) {
		
		return num1/num2 ;
	}

}
