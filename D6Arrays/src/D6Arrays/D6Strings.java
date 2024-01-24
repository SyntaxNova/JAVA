package D6Arrays;
import java.util.*;
public class D6Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Comparison
		String a = "tony";
		String b = "tony";
		System.out.println("Length : "+a.length());
		System.out.println("CharAt index 1 : "+a.charAt(1));
		System.out.println("Comparing str : "+a.compareTo(b));
		System.out.println("Substring [1,4) : "+a.substring(1,4)); //[i1,i2) not inclusive i2
		
		
		//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
		String length[] = new String[3];
		int lengthstr = 0 ;
		for(int i = 0 ; i<3 ; i++) {
			length[i] = sc.next();
			lengthstr = lengthstr + length[i].length();
		}
		System.out.println(lengthstr);
		
		//Qns : Input a string from the user. Create a new string called ‘result’ 
		//in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
		String e = sc.next();
		String result = "";
		for( int i= 0 ; i < e.length() ; i++) {
			if(e.charAt(i) == 'e') {
				result += 'i' ; 
			}else {
				result += e.charAt(i) ;
			}
		}System.out.println(result);
		
		//Input an email from the user. You have to 
		//create a user name from the email by deleting the part that comes after ‘@’. Display that username to the user.
		 String email = sc.next();
	     String userName = "";

	     for(int i=0; i<email.length(); i++) {
	       if(email.charAt(i) == '@') {
	        break;
	       } else {
	         userName += email.charAt(i);
	       }
	     }
	     System.out.println(userName);
	}

}

//

//stringName.length(); returns length of the string
//StringName.charAt(i); returns char of the string at i'th index
//String1.compareTO(String2)== 0; if same 
//+ve if Str1 > str2 ; -ve if str1 < str2
//substring(begining index , ending index-1); returns substring
//Strings are immutable



