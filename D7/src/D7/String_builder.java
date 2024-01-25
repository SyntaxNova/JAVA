package D7;
import java.util.*;
public class String_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder("Tony");
		
		//charAt(index);
		System.out.println(sb.charAt(0));
		
		//set(index);
		sb.setCharAt(0, 's');
		System.out.println(sb);
		
		//inserting character
		sb.insert(0, 'A');
		System.out.println(sb);
		
		//Deleting character
		sb.delete(0, 1); // (begi , endi] endi is exclusive 
		System.out.println(sb);   	//Deleting A from Asony
		
		//append : it will add char at the end 
		sb.append("a");
		sb.append("d");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		
		//Reversing String 
		for(int i = 0 ; i<sb.length()/2 ; i++) {
			int front = i ;
			int back = sb.length() - 1 - i ;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.println(sb);
	}

}
