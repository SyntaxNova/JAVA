package atharva;
import java.util.ArrayList;
public class ElementCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12);
		numbers.add(7);
		numbers.add(24);
		numbers.add(11);
		numbers.add(131);
		numbers.add(44);
		numbers.add(29);
		
		int evenCount = countElementsWithProperty(numbers, n-> n%2 == 0);
		System.out.println("Number of even numbers: " + evenCount);
		
		int oddCount = countElementsWithProperty(numbers , n -> n%2 != 0 );
		System.out.println("Number of odd numbers: " + oddCount);
		
		int primeCount = countElementsWithProperty(numbers,ElementCounter::isPrime );
		System.out.println("Number of prime numbers: " + primeCount);
		
		int palindromeCount = countElementsWithProperty(numbers , ElementCounter::isPalindrome);
		System.out.println("Number of palindrome numbers: " + palindromeCount);
		
	}
	private static <T> int countElementsWithProperty(ArrayList<T> collection, PropertyChecker<T> checker) {
        int count = 0;
		for (T element : collection) {
			if(checker.checkProperty(element)) {
				count++;
			}
		}
		return count ;
	}
	static boolean isPrime(int number) {
		if(number<2) {
			return false;
		}
		for(int i=2; i<= Math.sqrt(number); i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPalindrome(int number) {
		String strNumber = Integer.toString(number);
		String reversed = new StringBuilder(strNumber).reverse().toString();
		return strNumber.equals(reversed);
	}
	interface PropertyChecker<T>{
		boolean checkProperty(T element);
	}
}


