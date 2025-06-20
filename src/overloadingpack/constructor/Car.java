package overloadingpack.constructor;

public class Car {
	
	public Car() {
		System.out.println("Car constructor");
	}
	
	public Car(int a) {
		System.out.println("Car constructor "+a);
	}
	
	public Car(double a) {
		System.out.println("Car constructor "+a);
	}
	
	public Car(int a,int b) {
		System.out.println("Car constructor "+a+b);
	}
	
}
