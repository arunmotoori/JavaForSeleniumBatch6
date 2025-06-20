package staticobjectclassdemo;

public class Demo {

	public static void main(String[] args) {
		
		 Car msvdi = new Car("Maruti", "Swift VDI", "Red", 24.12);
		 
		 msvdi.startCar();
		 msvdi.stopCar();
		 msvdi.carDetails();
		
		 Car hamz = new Car("Honda", "Amaze", "Grey", 14);
		 
		 hamz.startCar();
		 hamz.stopCar();
		 hamz.carDetails();
		 
		 Car kc = new Car("Kia", "Carrens", "Black", 18);
		 
		 kc.startCar();
		 kc.stopCar();
		 kc.carDetails();
		 
		 Car tp = new Car("Tata", "Punch", "Blue", 16);
		 
		 tp.startCar();
		 tp.stopCar();
		 tp.carDetails();

	}

}
