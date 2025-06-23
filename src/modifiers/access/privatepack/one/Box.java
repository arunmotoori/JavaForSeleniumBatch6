package modifiers.access.privatepack.one;

public class Box {
	
	private int height = 5;
	private int width = 10;
	
	private void calculateArea() {
		System.out.println("Height of the box is "+height);
		System.out.println("Width of the box is "+width);
		System.out.println("Area of the box is "+(height*width));
	}
	
	private void sample() {
		calculateArea();
	}

}
