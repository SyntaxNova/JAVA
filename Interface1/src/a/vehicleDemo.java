package a;
import java.util.Scanner;
public class vehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Bicycle bicycle = new Bicycle();
		
		int bigear = scanner.nextInt();
		int bispeed =  scanner.nextInt();
		int bibrake = scanner.nextInt();
		
		bicycle.gear(bigear);
		bicycle.speed(bispeed);
		bicycle.brake(bibrake);
		// similar
	}

}
