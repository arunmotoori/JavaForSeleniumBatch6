package inheritancepack.concept;

public class Demo {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		c.pet = true;
		c.tail = true;
		c.fly = false;
		c.color = "Black";
		c.legs = 4;
		
		c.eat();
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
		
		Butterfly b = new Butterfly();
		
		b.pet = false;
		b.tail = false;
		b.fly = true;
		b.color = "Yellow";
		b.legs = 8;
		
		b.eat();
		b.sleep();
		b.fly();
		
		Lion l = new Lion();
		
		l.pet = false;
		l.tail = true;
		l.fly = false;
		l.color = "Orange";
		l.legs = 4;
		
		l.eat();
		l.sleep();
		l.run();
		l.climb();
		l.hunt();
	
	}

}
