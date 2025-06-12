package flowcontrolstatements.selection;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String foodItem = "Pizza";
		
		switch(foodItem) {
		
			case "Pasta":
				System.out.println("Here is your Pasta");
				break;
				
			case "Noodles":
				System.out.println("Here are your Noodles");
				break;
			
			case "Pizza":
				System.out.println("Here is your Pizza");
				break;
				
			case "Burger":
				System.out.println("Here is your Burger");
				break;
			
			case "Sandwitch":
				System.out.println("Here is your Sandwitch");
				break;
				
			default:
				System.out.println("We only serve Pasta, Noodles, Pizza, Burger and Sandwitch");
				
		}

	}

}
