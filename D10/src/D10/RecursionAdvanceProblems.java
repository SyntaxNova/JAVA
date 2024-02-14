package D10;

public class RecursionAdvanceProblems {
	
	
	public static void Permutation(String str , String permut) {
		if(str.length() == 0) {
			System.out.println(permut);
			return ;
		}
		//logic
		for(int i = 0 ; i<str.length() ; i++ ) {
			char current = str.charAt(i);
			String newstr = str.substring(0,i) + str.substring(i+1); //i+1 to till last //Declaring new string here
			Permutation( newstr , permut + current );
		}
	}
	
	public static int CountMazePath(int i , int j , int n , int  m ) {
		if(i==n-1 && j==m-1) {
			return 1 ;
		}
		
		if(i==n || j==m) {
			return 0 ;
		}
		//move down
		int down = CountMazePath(i+1,j,n,m);
		//move right
		int right = CountMazePath(i,j+1 ,n, m);
		
		return down + right ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String permut = "";
		Permutation(a,permut);
		
		int n = 3 ;
		int m = 3 ;
		System.err.println(CountMazePath(0,0,n,m));
	}

}
