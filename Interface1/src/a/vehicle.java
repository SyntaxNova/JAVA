package a;

public interface vehicle {
	void gear(int newgear);
	void speed(int increment);
	void brake(int decrement);
}
class Bicycle implements vehicle{
	int currentgear;
	
	public void gear(int newgear) {
		currentgear=newgear;
		System.out.print("gear "+ newgear +"\n");
	}
	public void speed(int increment) {
		System.out.print("speed up "+ increment +"\n");
	}
	public void brake(int decrement) {
		System.out.print("speed up "+ decrement +"\n");
	}
}
class Bike implements vehicle{
	int currentgear;
	
	public void gear(int newgear) {
		currentgear=newgear;
		System.out.print("gear "+ newgear +"\n");
	}
	public void speed(int increment) {
		System.out.print("speed up "+ increment +"\n");
	}
	public void brake(int decrement) {
		System.out.print("speed up "+ decrement +"\n");
	}
}
class car implements vehicle{
	int currentgear;
	
	public void gear(int newgear) {
		currentgear=newgear;
		System.out.print("gear "+ newgear +"\n");
	}
	public void speed(int increment) {
		System.out.print("speed up "+ increment +"\n");
	}
	public void brake(int decrement) {
		System.out.print("speed up "+ decrement +"\n");
	}
}
