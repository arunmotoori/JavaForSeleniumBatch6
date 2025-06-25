package modifiers.nonaccess.staticpack;

public class Plant {
	
	static boolean indoor = true;
	static int maxHeight = 15;
	
	public static void generateOxygen() {
		System.out.println("Plant is generating oxygen");
	}
	
	public static void waterThePlant() {
		System.out.println("Plant is getting waterring");
	}

}
