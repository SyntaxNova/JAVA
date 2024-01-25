package D7;

public class Sorting {
	
	public static void PrintArray(int arr[]) {
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,1,3,9};
		PrintArray(arr);
		System.out.println();
		
		// Bubble sort : compares two numbers one by one, largest element in the last place, 
		System.out.print("Bubble Sort : ");
		for(int i = 0 ; i<arr.length - 1 ; i++ ) {
			// Iteration for n-1 times 
			for(int j = 0 ; j<arr.length - 1 - i ; j++) {
				//last element is largest hence last place is fixed , rest will iterate
				if(arr[j] > arr[j+1]) { //comparing for largest number
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
		}PrintArray(arr);
		
		
		//Selection Sort
		System.out.print("Selection Sort : ");
		for(int i = 0 ; i<arr.length - 1 ; i++ ) {
			// Iteration for n-1 times 
			int smallest = i ; 
			for(int j = arr.length-1-i ; j< arr.length-1 ; j++) {
				if(arr[j] < arr[j+1]) {  // checking smallest number
					smallest = j ;
				}
				//Swapping 
				int temp = arr[smallest] ;
				arr[smallest] = arr[j];
				arr[j] = temp;
			}
		}PrintArray(arr);
		
		//Insertion Sort
		System.out.print("Insertion Sort : ");
		for(int i = 0 ; i<arr.length ; i++) {
			int current = arr[i] ;
			int j = i-1 ;
			while(j>=0 && arr[j]>current) {   
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current ;
		}
		PrintArray(arr);
		
	}

}

//Time Complexity for these sorting techniques is O(N^2);
