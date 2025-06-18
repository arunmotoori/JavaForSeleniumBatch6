package thiskeyword;

public class Car {
	
	String company;
	String modal;
	String color;
	double milage;
	int wheels;
	
	public Car(String company,String modal,String color,double milage,int wheels) {
		this.company = company;
		this.modal = modal;
		this.color = color;
		this.milage = milage;
		this.wheels= wheels;
	}
	
	public void startCar() {
		//company = "Maruti";
		//stopCar();
		System.out.println("Car from "+company+" and model "+modal+" has started");
	}
	
	public void stopCar() {
		System.out.println("Car from "+company+" and modal "+modal+" has stopped");
	}
	
	public void carDetails() {
		System.out.println("Company of the car is "+company);
		System.out.println("Modal of the car is "+modal);
		System.out.println("Color of the car is "+color);
		System.out.println("Milage of the car is "+milage);
		System.out.println("Number of wheels of the car are "+wheels);
		System.out.println("-----------------------------");
	}

}
