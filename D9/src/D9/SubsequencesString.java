package D9;

public class SubsequencesString {
	public static void Subsequences(String str , int idx , String nstr) {
		if(idx == str.length()) {
			System.out.println(nstr);
			return ;
		}
		char current = str.charAt(idx);
		
		//to be 
		Subsequences(str , idx+1 , nstr+current );
		//not to be 
		Subsequences(str , idx+1 , nstr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc" ;
		String nstr = "" ;
		Subsequences(a , 0 , nstr);
	}

}
