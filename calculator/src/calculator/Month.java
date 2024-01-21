package calculator;
import java.util.*;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Month Number : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
			System.out.print("January ");
			break;
		case 2 :
			System.out.print("February ");
			break;
		case 3 :
			System.out.print("March ");
			break;
		case 4 :
			System.out.print("April ");
			break;
		case 5 :
			System.out.print("May ");
			break;
		case 6 :
			System.out.print("June ");
			break;
		case 7 :
			System.out.print("july ");
			break;
		case 8 :
			System.out.print("August ");
			break;
		case 9 :
			System.out.print("September ");
			break;
		case 10 :
			System.out.print("october ");
			break;
		case 11 :
			System.out.print("November ");
			break;
		case 12 :
			System.out.print("December ");
			break;
		}
	}

}
