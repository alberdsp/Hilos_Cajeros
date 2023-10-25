package Tienda;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


// Clase en la que vamos a manejar a implementar una linea de cajas

public class Lineadecaja {

	private List<Dependiente> dependientes = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	// manejaremos los hilos con treemap por asignar mejor el indice en el que están
	


	public Lineadecaja() {

	}

	public int getClientes() {

		return clientes.size();

	}

	// método para añadir un dependiente a la lista
	public void agregarDependiente(Dependiente dependiente) {

		dependientes.add(dependiente);

	}

	// método para establecer añadir cliente a la cola
	public void nuevoCliente(Cliente cliente, long tiempo) {

		clientes.add(cliente);
		int index = clientes.indexOf(cliente);

		// creamos un bucle que trabaje hasta que no queden clientes por atender

		// creamos una lista de hilos, uno por cada dependiente

		// iteramos para recorrer el array de dependientes y crear los hilos
		while (clientes.size() > 0) {

			for (Dependiente d : dependientes) {

				if (d.getLibre()) {

					d.setCliente_tiempo(cliente, tiempo);
					d.setLibre(false);
					Thread hilo = new Thread(d);
					hilo.start();

					clientes.remove(index);

					return;

				}

			}

		}

	}

	public String comprobarCola() {

		boolean finalizado = true; // establece que se ha terminado de atender a todos
		String terminado = " Atendidos los ultimos clientes ";

		// recorremos las cajeras para saber si todas han terminado de atender
		do {

			finalizado = true;

			for (Dependiente d : dependientes) {

				if (!d.getLibre()) {

					finalizado = false;

				} else {

				}
			}

			// si quedan clientes por atender contiuamos el bucle
			while (clientes.size() > 0) {
				finalizado = false;
			}
			// si no están atendidos todos los clientes o alguna cajera está ocupada
			// continua
		} while (!finalizado);

		return terminado;

	}

}
