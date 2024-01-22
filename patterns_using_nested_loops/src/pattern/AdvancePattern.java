package pattern;

public class AdvancePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		
//butterfly
		// First Part
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			for(int j = 2*(n-i) ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		//Second Part
		for(int j = n ; j>= 1 ; j--) {
			for(int k = 1 ; k<=j ; k++) {
				System.out.print("*");
			}
			for(int k =1  ; k<= 2*(n-j); k++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=j ; k++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		
		//rhombus
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=n ; j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		//hollow rhombus
		int m = 9 ;
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=m ; j++) {
				int sum = i+j;
				if(sum == 6 || sum == 10 || (i==1 && j>=5) || (i == n && j<=5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		//hollow rectangle
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=m ; j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		
		//Number Pyramid 
		for(int i = 1 ; i <=n ; i++) {
			for(int j = 1 ; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ;j<=i ;j++) {
				System.out.print(i+" ");  //Just added a space 
			}System.out.println();	
		}System.out.println();
		
		
		//palindromic pattern
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int j = i; j>=1  ; j--) {
				System.out.print(j);
			}
			for(int j = 2; j<=i  ; j++) {
				System.out.print(j);
			}System.out.println();
		}System.out.println();
		
		//diamond Pattern
		for(int i = 1 ; i<=n ; i++ ) {
			//first half
			for(int j = 1 ; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}
			for(int j = 2 ; j<=i ; j++) {
				System.out.print("*");
			}System.out.println();
			
			//second half
			for(int j = n ; j>=1 ; j--) {
				System.out.print("*");
			}
			for(int j = 1 ; j<=n ; j++) {
				System.out.print(" ");
			}System.out.println();
		}
		
		
		
		
	}

}
