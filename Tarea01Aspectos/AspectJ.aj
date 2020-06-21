public aspect AspectJ {	
   
    // collection of JoinPoint call pintarRojo of class Main.
    pointcut pintarRojo(): call(* pintarRojo()); 
    before() : pintarRojo() {
        System.out.println("Color Rojo");
    } 
    after() : pintarRojo()  {
        System.out.println("Cambio de color a la ventana al color Rojo");
    }  
	
	// collection of JoinPoint call pintarAzul of class Main.
    pointcut pintarAzul(): call(* pintarAzul()); 
    before() : pintarRojo() {
        System.out.println("Color Azul");
    } 
    after() : pintarAzul()  {
        System.out.println("Cambio de color a la ventana al color Azul");
    }  
	
	// collection of JoinPoint call pintarVerde of class Main.
    pointcut pintarVerde(): call(* pintarVerde()); 
    before() : pintarRojo() {
        System.out.println("Color Verde");
    } 
    after() : pintarVerde()  {
        System.out.println("Cambio de color a la ventana al color Verde");
    }  
}  
