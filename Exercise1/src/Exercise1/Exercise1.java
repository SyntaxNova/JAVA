package Exercise1;
import java.util.Scanner;
public class Exercise1 {

	//Qns 1 : Enter 3 numbers from the user & make a function to print their average.
	public static void Average(float a , float b , float c) {
		float avg = (a+b+c)/3 ;
		System.out.println("Average of "+a+","+b+","+c+","+" is => "+ avg);
		return ;
	}
	
	//Qns 2 : Write a function to print the sum of all odd numbers from 1 to n.
	static int sumodd = 0 ;
	public static void OddSum(int n) {
		for(int i = 1; i<=n ; i++) {
			if(i % 2 != 0) {	//even numbers
				sumodd = sumodd + i ;
			}
		}
		System.out.println("Sum of odd Numbers till "+n+" is => "+sumodd);
		return;
	}
	
	//Qns 3 : Write a function which takes in 2 numbers and returns the greater of those two.
	public static void GetMax(int a, int b) {
		if(a==b) {
			System.out.println("Both numbers are Equal ");
		}else if(a<b) {
			System.out.println("B is Greater than A");
		}else {
			System.out.println("A is Greater than B");
		}
	}
	
	//Qns 4 : Write a function that takes in the radius as input and returns the circumference of a circle.
	public static void Circumference(int radius) {
		System.out.println("Circumference of circle "+ 2*(3.14)*radius);
		return ;
	}
	
	//Qns 5 : Write a function that takes in age as input and returns if that person is eligible to vote or not.
	// A person of age > 18 is eligible to vote.
	public static void EligibityForVote(int age) {
		if(age >= 18) {
			System.out.println("Can Vote !");
		}else {
			System.out.println("Can vote after "+ (18-age)+ " yrs" );
		}return;
	}
	
	//Qns 6) Write an infinite loop using do while condition.
	public static void InfiniteLoop(int n) {
		int i = n ;
		do {
			System.out.println(i);
			i++;
		}while(i>=1);
	}
	
	//Qns 7) Write a program to enter the numbers till the user wants and at the end it should display the count of positive, 
	//negative and zeros entered.
	
	public static void NumberCount(char choice) {
		Scanner sc = new Scanner(System.in);
		int number ;
		int Positive = 0 ;
		int negative = 0 ;
		int zeros = 0 ;
		
		do {
			System.out.print("Enter Number : ");
			number = sc.nextInt();
			
			if(number>0) {
				Positive++;
			}else if(number==0) {
				zeros++;
			}else {
				negative++;
			}
			System.out.print("continue ? (y/n)"); 
			choice = sc.next().charAt(0); 	// new concept
			
		}while(choice == 'y' || choice == 'Y');
		
		System.out.println(Positive + " "+negative + " "+ zeros +" ");	
	}
	
	//Qns 8) Two numbers are entered by the user, x and n. 
	//Write a function to find the value of one number raised to the power of another i.e. xn.
	public static void PowerCalculate(int n , int x) {
		int result = 1 ;
		for(int i = 1 ; i<=x ; i++) {
			result = result*n; 
		}
		System.out.println("n raise to x is : "+result);
	}
	
	//Qns 9) Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
	public static void GCD(int n , int x) {
		int gcd = 1 ;
		for(int i = 1 ; i<=n && i<=x ; i++) {
			if(n % i == 0 && x % i == 0) {
				gcd = i ;
			}
		}
		System.out.println("GCD of Two Numbers is : " + gcd );
	}
	
	
	//10) Write a program to print Fibonacci series of n terms where n is input by user :
	//	0 1 1 2 3 5 8 13 21 ..... 
	//	In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
	public static void FibonacciSeries(int n) {
		int n1 = 0 ;
		int n2 = 1 ;
		int sum ;
		System.out.print("Fibonaccie Series : ");
		System.out.print(n1+" "+n2+" ");
		for(int i = 2 ; i<=n+2 ; i++) {
			sum = n1 + n2 ;
			System.out.print(sum+" ") ;
			n1 = n2 ;
			n2 = sum ;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Qns 1 : 
//		System.out.print("Enter num a : ");
//		int a = sc.nextInt();
//		System.out.print("Enter num b : ");
//		int b = sc.nextInt();
//		System.out.print("Enter num c : ");
//		int c = sc.nextInt();
		
//		Average(a,b,c);
		
		
		//Qns 2 :
//		System.out.print("Enter num n : ");
//		int n = sc.nextInt();
		
//		OddSum(n);
		
		//Qns 3 :
//		GetMax(a,b);
		
		//Qns 4 :
//		System.out.print("Enter Radius r : ");
//		int radius = sc.nextInt();
//		Circumference(radius);
		
		//Qns 5 :
//		System.out.print("Enter Age : ");
//		int age = sc.nextInt() ;
//		EligibityForVote(age) ;
		
		//Qns 6 : 
//		System.out.print("Enter num : ");
//		int n = sc.nextInt() ;
//		InfiniteLoop(n);
		
		//Qns 7 :
//		System.out.print("continue ? (y/n)");
//		char choice = sc.next().charAt(0);
//		NumberCount(choice);
		
		//Qns 8 :
//		System.out.print("Enter n : ");
//		int pn = sc.nextInt() ;
//		System.out.print("Enter x : ");
//		int xn = sc.nextInt() ;
//		PowerCalculate(pn,xn);
		
		//Qns 9 :
//		System.out.print("Enter n1 : ");
//		int gn = sc.nextInt() ;
//		System.out.print("Enter n2 : ");
//		int gx = sc.nextInt() ;
//		GCD(gn,gx);
		
		//Qns 10 : 
		System.out.print("Enter Number of terms : ");
		int fs = sc.nextInt();
		FibonacciSeries(fs);
		
	}

}
/*
Questions : 
	1) Enter 3 numbers from the user & make a function to print their average.  //Done
	
	2) Write a function to print the sum of all odd numbers from 1 to n.		//Done
	
	3)Write a function which takes in 2 numbers and returns the greater of those two.	//Done
	
	4) Write a function that takes in the radius as input and returns the circumference of a circle.	//Done
	
	5) Write a function that takes in age as input and returns if that person is eligible to vote or not.	//Done
	A person of age > 18 is eligible to vote.
	
	6) Write an infinite loop using do while condition.
	
	7) Write a program to enter the numbers till the user wants and at the end it should display the count of positive, 
	negative and zeros entered. //Done charAt(0);
	 
	8) Two numbers are entered by the user, x and n. 
	Write a function to find the value of one number raised to the power of another i.e. xn.  //Done
	
	9) Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
	
	10) Write a program to print Fibonacci series of n terms where n is input by user :
	0 1 1 2 3 5 8 13 21 ..... 
	In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
	(BONUS)

*/
