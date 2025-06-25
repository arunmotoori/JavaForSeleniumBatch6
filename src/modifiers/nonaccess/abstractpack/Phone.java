package modifiers.nonaccess.abstractpack;

public abstract class Phone {
	
	public void startPhone() {
		
		System.out.println("Phone started");
		
	}
	
	public void stopPhone() {
		
		System.out.println("Phone stopped");
		
	}
	
	public void call() {
		
		System.out.println("Calling using Phone");
		
	}
	
	public abstract void sendWhatsappMessage();
	
	public abstract void connectToWifi();
	

}
