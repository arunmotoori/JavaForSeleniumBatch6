package modifiers.nonaccess.abstractpack;

public abstract class Apple extends Phone {
	
	@Override
	public void sendWhatsappMessage() {
		System.out.println("Sending message via Whatsapp");
	}
	
}
