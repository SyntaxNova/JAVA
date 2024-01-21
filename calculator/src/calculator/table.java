package calculator;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		int table = 0 ;
		for(int i = 0 ; i<10 ; i++) {
			table = table + n ;
			System.out.println(table);
		}
		/*
		for(int i = 0 ; i < 10 ; i++){
			System.out.println(n*i);
		}
		*/
		
	}

}
