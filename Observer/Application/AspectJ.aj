public aspect AspectJ {	
   
    // collection of JoinPoint call pintarRojo of class Main.
    pointcut PintarRo(): execution(* PintarRojo(..)); 
    pointcut PintarAz(): execution(* PintarAzul(..)); 
    pointcut PintarVerde(): execution(* PintarVerde(..)); 
    after(): PintarRo() {
    	System.out.println("Pintando a color rojo");
    }
    after(): PintarAz() {
    	System.out.println("Pintando a color azul");
    }
    after():PintarVerde(){
    	System.out.println("Pintando a color verde");
    }
}
  