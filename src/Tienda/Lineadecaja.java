package Tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Lineadecaja {
	
	private List<Dependiente> dependientes = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	// manejaremos los hilos con treemap por asignar mejor el indice en el que están
	private TreeMap<Integer,Thread> hilos = new TreeMap<Integer,Thread>();
		
	
	public Lineadecaja(){
		
	}
	
	public int getClientes() {
		
		return clientes.size();
		
	}
	
	// método para añadir un dependiente al array de uno en uno
	public void agregarDependiente(Dependiente dependiente) {
		
			  	 
		
		    dependientes.add(dependiente);
		 
		    
		   
	}
	// método para establecer las cajeras disponibles todas de golpe
	public void nuevoCliente(Cliente cliente, long tiempo) {
		
		
		
		clientes.add(cliente);
		int index = clientes.indexOf(cliente);
		
		// creamos un bucle que trabaje hasta que no queden clientes por atender
		
	
		
		// creamos una lista de hilos, uno por cada dependiente
		
				
		 // iteramos para recorrer el array de dependientes y crear los hilos
		while (clientes.size()>0) {
			
				 
				
		for ( Dependiente d:dependientes) {
			 
			    if (d.getLibre()) {
			    	
			    	d.setCliente_tiempo(cliente, tiempo);
			        d.setLibre(false);
			    Thread hilo = new Thread(d);
			    hilos.put(d.getNcaja(), hilo);
			    
			    hilo.start();
			  
					clientes.remove(index);
					
			    break;
			    
			 
		 }
		}
		
		
	}
		  
			
		
	}

}
