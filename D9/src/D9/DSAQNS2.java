package D9;

public class DSAQNS2 {
	//Reverse the Array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array[] = {3,7,5,1,9,7};
		
		int arr[] = new int[Array.length] ;
		
		for(int i = 0 ; i<Array.length ; i++) {
			arr[i] = Array[arr.length-1-i];
		}
		
		//Original Array Output : 
		System.out.print("Original Array : ");
		for(int i = 0 ; i<Array.length ; i++) {
			System.out.print(Array[i]+" ");
		}
				
		//Reversed Array Output : 
			System.out.println();

		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
