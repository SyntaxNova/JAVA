package D9;

public class RemoveDuplicate {
	
	public static boolean[] map = new boolean[26];  //26 Unique Alphabets 
	
	public static void RemoveDuplicates(String str , int idx , String newstr) {
		
		if(idx == str.length()-1) {
			System.out.println(newstr);
			return ;
		}
		
		char current = str.charAt(idx);
		
		if(map[current-'a'] == true) {		//no need to write ==true ; it is by default
			RemoveDuplicates( str ,  idx+1 ,  newstr);
		}else {
			newstr += current ;
			map[current - 'a'] = true ;
			RemoveDuplicates( str ,  idx+1 ,  newstr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "aabbccdde";
		String newstr = "";
		
		RemoveDuplicates( a ,  0 ,  newstr);
		
	}

}
