package classsandobjects.two;

public class Demo {

	public static void main(String[] args) {
		
		 Car msvdi = new Car();
		 
		 msvdi.initCar("Maruti", "Swift VDI", "Red", 24.12, 4);
		 
		 msvdi.startCar();
		 msvdi.stopCar();
		 msvdi.carDetails();
		
		 Car hamz = new Car();
		 
		 hamz.initCar("Honda", "Amaze", "Grey", 14, 4);
		 
		 hamz.startCar();
		 hamz.stopCar();
		 hamz.carDetails();
		 
		 Car kc = new Car();
		 
		 kc.initCar("Kia", "Carrens", "Black", 18, 4);
		 
		 kc.startCar();
		 kc.stopCar();
		 kc.carDetails();
		 
		 Car tp = new Car();
		 
		 tp.initCar("Tata", "Punch", "Blue", 16, 4);
		 
		 tp.startCar();
		 tp.stopCar();
		 tp.carDetails();

	}

}
