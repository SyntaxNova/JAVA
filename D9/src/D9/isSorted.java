//Check if the array is Strictly Sorted or not 
package D9;

public class isSorted {
	
	public static boolean isSorted(int arr[] , int idx) {
		if(idx == arr.length-1) {
			System.out.println("True");
			return true ;
		}
		if(arr[idx] < arr[idx+1]) {
			//all sorted here
			isSorted(arr , idx+1);
			
		}else {
			System.out.println("False");
			return false ;
		}
		return true ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		isSorted(arr , 0);
	}

}
