package inheritancepack.overloading;

public class Cat extends Animal {
	
	public Cat() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void eat(int a) {
		System.out.println("Animal is eating"+a);
	}
	
}
