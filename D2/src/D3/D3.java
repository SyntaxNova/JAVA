package D3;
import java.util.Scanner;
public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		
		if(n%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
		System.out.print("Enter a number : ");
		int a = scanner.nextInt();
		System.out.print("Enter b number : ");
		int b = scanner.nextInt();
		
		if(a==b) {
			System.out.print("a and b is equal ");
		}else if(a>b) {
			System.out.print("b is smaller than a ");
		}else {
			System.out.print("a is smaller than b ");
		}
	}

}
