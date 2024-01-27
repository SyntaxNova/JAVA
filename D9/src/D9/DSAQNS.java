package D9;
import java.util.*;
public class DSAQNS { //DSAQNS1
	
	
	public static void getMINMAX(int arr[]) {
		
		Arrays.sort(arr);	// Sorting array in Ascending Order
		
		int min = arr[0];
		int max = arr[arr.length -1];
		System.out.print("Minimum : "+min+"\n");
		System.out.print("Maximum : "+max);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = {7,6,2,3,0,1};
		getMINMAX(array);
		
		
	}

}
//Output : 
//	Minimum : 0
//	Maximum : 7

