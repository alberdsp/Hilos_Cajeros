package Tienda;

/*
 *  Clase que define a los clientes
 */
public class Cliente {

	private int[] compra; // array con milisegundo de duracion de cada compra
	private String nombre; // nombre del cliente

	// constructor
	public Cliente(String nombre, int[] compra) {
		this.nombre = nombre;
		this.compra = compra;
	}

	// devuelve array de enteros con la compra

	public int[] getCompra() {
		return compra;
	}

	// devielve el nombre

	public String getNombre() {

		return this.nombre;
	}

	// establece array de enteros con la compra
	public void setCompra(int[] compra) {
		this.compra = compra;
	}

}
