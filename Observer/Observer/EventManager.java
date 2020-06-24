package Observer;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
	private List<EventListener> observadores = new ArrayList<EventListener>();
	private String estado;
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
		notificar();
	}
	
    public void subscribe(EventListener observador) {
        observadores.add(observador);
    }

    public void unsubscribe(EventListener observador) {
        observadores.remove(observador);
    }

    public void notificar() {
        for (EventListener observador: observadores) {
        	observador.actualizar();
        }
        
    }
}
