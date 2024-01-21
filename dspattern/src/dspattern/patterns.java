package dspattern;
import java.util.*;
public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter Number of columns : ");
		int m = sc.nextInt();
		
		// Solid Pattern : 
		for(int i = 1 ; i <= n ; i++ ) {
			for(int j = 1 ; j <= m ; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		/*
		output for 4 & 5: 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		 
		*/
		System.out.println();
		
		// Hollow Rectangle :
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j <= m ; j++ ) {
				//cell -> (i,j)
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print("* ");
				}else {
					System.out.print("  ");				
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// Half Pyramid
		for(int i = 1 ; i <= n ; i++ ) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		
		// Inverted Half Pyramid
		for(int i = n ; i>=1 ; i--) {
			for(int j= 1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// inverted Half pyramid 180 degree rotated
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// Half pyramid with numbers
		for(int i = 1 ; i <= n ; i++) {
			for(int k = 1 ; k <= i ; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// inverted	Half pyramid with numbers
		for(int i = n ; i >= 1 ; i--) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Floyd's Triangle
		int number = 1;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		System.out.println();
		
		// 0-1 Triangle
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				int sum = i + j;
				if(sum % 2 == 0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}System.out.println();
		}
		
	}

}

