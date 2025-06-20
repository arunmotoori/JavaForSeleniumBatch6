package inheritancepack.overloading;

public class Demo {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.pet = true;
		c.tail = true;
		c.fly = false;
		c.color = "Black";
		c.legs = 4;
		
		c.eat();
		//c.eat(5);
		c.sleep();
		c.run();
		c.climb();
		c.hunt();
		
		Dog d = new Dog();
		
		d.pet = true;
		d.tail = true;
		d.fly = false;
		d.color = "Grey";
		d.legs = 4;
		d.breed = "Husky";
		
		d.eat();
		d.sleep();
		d.run();

	}

}
