package D9;

public class TowerOfHanoi {
	
	//Tower of Hanoi 
	public static void TowerOfHanoi(int n , String src , String helper , String dest) {
		if(n==1) {
			System.out.println("disk transfer from : "+src+" to "+dest);
			return ;
		}
		
		TowerOfHanoi(n-1 , src ,dest, helper );
		System.out.println("disk transfer "+n+" from : "+src+" to "+dest);
		TowerOfHanoi(n-1 , helper ,src, dest );
	}
	
	//Printing Reverse String using Recursion
	public static void PrintRev(String str , int index) {
		
		if(index == 0) {
			System.out.println(str.charAt(index));
			return ;
		}
		System.out.print(str.charAt(index)+" ");
		PrintRev(str , index-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2 ;
		TowerOfHanoi(n,"S" ,"H" ,"D");
		
		String rev = "abcd";
		PrintRev(rev , rev.length()-1);
	}

}
