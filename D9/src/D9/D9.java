package D9;

public class D9 {
	public static void PrintSum(int i , int n , int sum) {
		if(i == n) {
			sum += i ;
			System.out.print(sum) ;
			return ;
		}
		sum += i ;
		PrintSum(i+=1 , n , sum);
	}
	public static void FactorialNum(int i , int fact) {
		if(i == 0) {
			System.out.println(fact);
			return ;
		}
		fact *= i ; 
		FactorialNum(i-=1 ,fact);
	}
	public static void FibonacciSeries(int n , int n1 , int n2) {
		int sum = n1 + n2; ;
		if(n-2 == 0) {
			return ;
		}
		System.out.print( sum + " " );
		FibonacciSeries(n-1 , n2 ,sum); // swapping happens
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintSum(1 , 5 , 0);
		//FactorialNum(1 , 1);
//		int n1 = 0 ;
//		int n2 = 1 ;
//		System.out.print(n1 + " " + n2 +" ");
//		// n terms
//		FibonacciSeries(5 , n1 , n2);
	}

}
