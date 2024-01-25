package D7;

public class Recursion {

	public static void PrintNum(int n) {
		if(n==6) {
			return ;
		}
		System.out.print(n+"  ");
		PrintNum(n+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1 ;
		PrintNum(n);
	}

}
