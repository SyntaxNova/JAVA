package D9;

public class Ocuurance {
	
	public static int first = -1 ;
	public static int last = -1 ;
	
	public static void OcuuranceFL(String str , char element , int index) {
		if(index == str.length()-1 ) {
			System.out.print("First occurence at : "+ first+"\n");
			System.out.print("last occurence at : "+ last+"\n");
			return;
		}
		
		char current = str.charAt(index);
		if(current == element) {
			if(first == -1) {
				first = index ;
			}else {
				last = index ;
			}
			
		}
		OcuuranceFL(str , element , index+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "abbacadeaartaui";
		OcuuranceFL(ab , 'a' , 0);
		
//		First occurence at : 0
//		last occurence at : 12
	}

}
