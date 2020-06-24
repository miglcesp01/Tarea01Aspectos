import Observer.Alerta;
import Observer.EventManager;

public aspect AspectJ {	
   
	EventManager sujeto = new EventManager();
	Alerta alterta = new Alerta(sujeto);
	
    // collection of JoinPoint call pintarRojo of class Main.
    pointcut PintarRo(): execution(* PintarRojo(..)); 
    pointcut PintarAz(): execution(* PintarAzul(..)); 
    pointcut PintarVerde(): execution(* PintarVerde(..)); 
    after(): PintarRo() {
    	sujeto.setEstado("rojo");
    }
    after(): PintarAz() {
    	sujeto.setEstado("azul");
    }
    after():PintarVerde(){
    	sujeto.setEstado("verde");
    }
}
  