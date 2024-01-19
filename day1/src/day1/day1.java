package day1;
import java.util.*;
public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		/*System.out.print("Hello world\n");
		//also use println instead of \n
		System.out.print("Hello world \n");
		System.out.print("*\n**\n***\n****");
		*/
		/*primitive
		  byte
		  short
		  char
		  boolean
		  int 
		  long
		  float
		  double
		 */
		/*
		 NON-PRIMITIVE
		 string
		 array
		 class
		 object
		 interface
		 */
		//conditional statements
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("Can vote ");
		}else {
			System.out.println("Cannot vote ");
		}
	}

}
