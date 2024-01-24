package D6Arrays;
import java.util.*;
public class D62DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Rows and columns : ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int numbers[][] = new int[rows][columns];
		//Input
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0 ; j<columns ; j++) {
				//(i,j)
				numbers[i][j] = sc.nextInt(); 
			}System.out.println();
		}
		//Output
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0 ; j<columns ; j++) {
				//(i,j)
				System.out.print(numbers[i][j]+" ");
			}System.out.println();
		}
		
		//searching
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		for(int i = 0 ; i<rows ; i++) {
			for(int j = 0 ; j<columns ; j++) {
				//(i,j)
				if(numbers[i][j] == x) {
					System.out.print("Found x at : ("+i+","+j+")");
				}
			}System.out.println();
		}
	}

}
