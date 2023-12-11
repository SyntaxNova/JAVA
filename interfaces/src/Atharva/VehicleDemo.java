package Atharva;
import java.util.*;
public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter bicycle gearchange, speedup, brakes :");
		int bicyclegearchange = scanner.nextInt();
		int bicyclespeedup =scanner.nextInt();
		int bicyclebrakes = scanner.nextInt();
		
		bicycle.gearchange(bicyclegearchange) ;
		bicycle.speedup(bicyclespeedup);
		bicycle.brakes(bicyclebrakes);
		
		//similar for bike and car
	}

}
