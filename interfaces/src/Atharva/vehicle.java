package Atharva;

interface vehicle{
	void gearchange(int newgear);
	void speedup(int increment);
	void brakes(int decrement);
}

class Bicycle implements vehicle{
	int currentgear;
	public void gearchange(int newgear) {
		currentgear = newgear;
		System.out.print("bicycle gearchange : " + newgear + "\n");
	}
	public void speedup(int increment) {
		System.out.print("bicycle speedup : " + increment+ "\n");
	}
	public void brakes(int decrement) {
		System.out.print("bicycle speedup : " + decrement+ "\n");
	}
	
}
class bike implements vehicle{
	int currentgear;
	public void gearchange(int newgear) {
		currentgear = newgear;
		System.out.print("bike gearchange : " + newgear+ "\n");
	}
	public void speedup(int increment) {
		System.out.print("bike speedup : " + increment+ "\n");
	}
	public void brakes(int decrement) {
		System.out.print("bike speedup : " + decrement+ "\n");
	}
}
class car implements vehicle{
	int currentgear;
	public void gearchange(int newgear) {
		currentgear = newgear;
		System.out.print("car gearchange : " + newgear+ "\n");
	}
	public void speedup(int increment) {
		System.out.print("car speedup : " + increment+ "\n");
	}
	public void brakes(int decrement) {
		System.out.print("car speedup : " + decrement+ "\n");
	}
}

