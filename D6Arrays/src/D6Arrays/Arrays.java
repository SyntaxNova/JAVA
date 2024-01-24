package D6Arrays;
import java.util.*;
public class Arrays {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ways to define an array
		Scanner sc = new Scanner(System.in);
		int count  = 1 ;
		
		System.out.print("Enter size of array : ");
		int size  = sc.nextInt();
		
//		int[] arr1 = new int [size];
//		int arr[] = new int [size];
//		int arr3[] = {1,2,3,4,5,6,7,8,9};
//		
//		//adding numbers to arr1
//		arr1[0] = 97 ;
//		arr1[1] = 99 ;
//		arr1[2] = 93 ;
//		
		//Input array 2
//		
//		for(int i = 0 ; i<arr.length ;i++) {		// "arr1.length" is the alternative to write the size of array
//			System.out.print("Enter element "+(count++)+" : ");
//			arr[i] = sc.nextInt();
//		}
//		//Printing arrays
//		System.out.print("Array 1 is : ");
//		
//		
//		for(int i = 0 ; i<size ; i++) {
//			System.out.print(arr1[i]+" ");
//		}
//		
//		System.out.println();
//		System.out.print("Array 2 is : ");
//		
//		for(int i = 0 ; i<size ; i++) {
//			System.out.print(arr2[i]+" ");
//		}
//		
//		System.out.println();
//		System.out.print("Array 3 is : ");
//		
//		for(int i = 0 ; i<size ; i++) {
//			System.out.print(arr3[i]+" ");
//		}
//		
//		System.out.println();
		
		// linear Searching x in array
//		System.out.print("Enter x :");
//		int x = sc.nextInt();
//		for(int i = 0 ; i<arr.length ; i++) {
//			if(arr[i] == x) {
//				System.out.println("x is found at index : " + i);
//			}
//		}
		
		//Take an array of names as input from the user and print them on the screen
//		
//		String names[] = new String[size];
//		for(int i = 0 ; i<names.length ; i++) {
//			System.out.print("Enter Name "+(count++)+" : ");
//			names[i] = sc.next();
//		}count = 1 ;
//		for(int i = 0 ; i<names.length ; i++) {
//			System.out.println("Name "+(count++)+" : "+names[i]);
//		}System.out.println();
		
		
		//Find the maximum & minimum number in an array of integers. 
		int numbers[]= new int[size];
		for(int i = 0 ; i<numbers.length ; i++) {
			System.out.print("Enter element "+(count++)+" : ");
			numbers[i] = sc.nextInt();
		}
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		for(int i = 0 ; i<numbers.length ; i++) {
//			if(numbers[i]>max) {
//				max = numbers[i];
//			}else if (numbers[i]<min) {
//				min = numbers[i];
//			}
//		}System.out.print("Maximum value : "+max+"\n"+"Minimum value : "+min);
		
		//Take an array of numbers as input and check if it is an array sorted in ascending order.
		boolean isAscending = true ;
		for(int i = 0 ; i<numbers.length-1 ;i++) {  //Notice : length-1
			if(numbers[i]>numbers[i+1]) {
				isAscending = false ;
			}
		}
		if(isAscending) {
			System.out.print("Ascending ");
		}else {
			System.out.print("Decending ");
		}

	}
	

}

// Integer.MIN_VALUE;
// Integer.MAX_VALUE;
// Array.length : variable to find size of array
