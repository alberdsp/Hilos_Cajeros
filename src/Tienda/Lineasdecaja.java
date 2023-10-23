package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Lineasdecaja {
	
	Dependiente dependientes[];
	Cliente cliente[];
		
	
	public Lineasdecaja(){
		
	}
	
	
	// método para establecer las cajeras disponibles
	public void setDependientes(Dependiente dependientes[]) {
		
		this.dependientes = dependientes;
		// creamos una lista de hilos, uno por cada dependiente
		
		List<Thread> hilos = new ArrayList<>();
		
		 // iteramos para recorrer el array de dependientes y crear los hilos
		
		 for ( Dependiente d:dependientes) {
			 
			    Thread hilo = new Thread(d);
			    hilos.add(hilo);
			    hilo.start();
			 
		 }
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
