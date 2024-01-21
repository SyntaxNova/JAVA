package calculator;
import java.util.Scanner;
public class sumNN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		for(int i = 1 ; i<=n; i++) {
			sum = sum + i ;
		}
		System.out.print("Sum of N natural numbers are : "+ sum);
	}

}
