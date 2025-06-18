package classsandobjects.one;

public class Demo {

	public static void main(String[] args) {
		
		 Car msvdi = new Car();
		 
		 msvdi.company = "Maruti";
		 msvdi.modal = "Swift VDI";
		 msvdi.color = "Red";
		 msvdi.milage = 24.12;
		 msvdi.wheels = 4;
		 
		 msvdi.startCar();
		 msvdi.stopCar();
		 msvdi.carDetails();
		
		 Car hamz = new Car();
		 
		 hamz.company = "Honda";
		 hamz.modal = "Amaze";
		 hamz.color = "Grey";
		 hamz.milage = 14;
		 hamz.wheels = 4;
		 
		 hamz.startCar();
		 hamz.stopCar();
		 hamz.carDetails();
		 
		 Car kc = new Car();
		 
		 kc.company = "Kia";
		 kc.modal = "Carrens";
		 kc.color = "Black";
		 kc.milage = 18;
		 kc.wheels = 4;
		 
		 kc.startCar();
		 kc.stopCar();
		 kc.carDetails();
		 
		 Car tp = new Car();
		 
		 tp.company = "Tata";
		 tp.modal = "Punch";
		 tp.color = "Blue";
		 tp.milage = 16;
		 tp.wheels = 4;
		 
		 tp.startCar();
		 tp.stopCar();
		 tp.carDetails();

	}

}
