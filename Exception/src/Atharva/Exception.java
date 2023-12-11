package Atharva;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("num1 : ");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.print("num2 : ");
			int num2 = Integer.parseInt(scanner.nextLine());
			int division = dividenum(num1,num2);
			System.out.print("Result of Num1/Num2 : " + division + "\n");
			
			int[] array = new int[5];
            int value = array[10];
			
		}catch(NumberFormatException e){
			System.out.print("Number Format Exception: Please enter valid integers.");
			
		}catch(ArithmeticException e) {
			System.out.print("Arithmatic Exception: Please enter valid integers.");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Arrays out of bounds Exception: Please enter valid integers.");
			
		}finally {
			scanner.close();
		}
	}
	public static int dividenum(int num1,int num2) {
		return num1/num2 ;
		
	}
}

