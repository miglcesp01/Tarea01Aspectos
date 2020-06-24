package Observer;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerta extends EventListener{
	
	public Alerta(EventManager sujeto) {
        this.sujeto = sujeto;
        this.sujeto.subscribe(this);
    }

    public void actualizar() {
        System.out.println("Cambio de color " + sujeto.getEstado());
        alerta();
    }
    
    public void alerta() {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Notificación");
    	alert.setHeaderText("Sucedio un cambio en el color de la ventana");
    	alert.setContentText("Sólo eso queria mostrarte crack!");
    	alert.showAndWait();
    }
    
}
