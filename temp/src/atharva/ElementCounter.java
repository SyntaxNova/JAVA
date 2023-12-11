package atharva;
import java.util.ArrayList;
public class ElementCounter {
	interface PropertyChecker<T>{
		boolean checkproperty(T elements);
	}
	private static <T> int countelementswithproperty(ArrayList<T> collection, PropertyChecker<T> checkproperty) {
		int count= 0;
		for(T elements : collection) {
			if (checker.checkerProperty(elements)) {
				count++;
			}
		}return count ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(12);
		numbers.add(11);
		numbers.add(131);
		numbers.add(44);
		numbers.add(29);
		
		int evencount = countelementswithproperty(numbers, n-> n%2 ==0);
		System.out.println("Number of even numbers: " + evencount);
		
		int oddCount = countelementswithproperty(numbers , n-> n%2 !=0);
		System.out.println("Number of odd numbers: " + oddCount);
		
		
	}

}
