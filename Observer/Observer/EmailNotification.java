package Observer;

public class EmailNotification implements EventListener{
	private String email;
	
	public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String email) {
        System.out.println("Se produjo el siguiente cambio: " + eventType + "por parte de: "+ email + ", se procede a notificar a: "+ this.email);
    }
}
