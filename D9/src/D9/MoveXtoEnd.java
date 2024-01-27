package D9;

public class MoveXtoEnd {
	
	public static int count = 0 ;
	public static String nstr = "";
	
	public static void MoveXTOEnd(String str , int idx  , char element ) {
		if(idx == str.length()) {
			for(int i = 0 ; i<count ; i++) {
				nstr += element ;
			}
			System.out.println(nstr);
			return ;
		}
		char current = str.charAt(idx);
		if(current == element) {
			count+=1;
		}else {
			nstr += str.charAt(idx);
		}
		MoveXTOEnd(str , idx+1 , element);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "axbcxdexsdxklop";
		
		MoveXTOEnd(abc , 0 , 'x');
	}

}
