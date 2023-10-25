package Tienda;


/*
 *  Autor Alberto Barberá Ferrández  2023
 */
public class Main {

	public static void main(String[] args) {

		// instanciamos clientes y dependientes incorporo más ejemplos para la cola
		Cliente lola = new Cliente("Lola", new int[] { 200, 400, 300, 200 });
		Cliente pepe = new Cliente("Pepe", new int[] { 200, 200, 500, 200, 300 });
		Cliente manolo = new Cliente("Manolo", new int[] { 100, 200, 500 });
		Cliente antonio = new Cliente("Antonio", new int[] { 100, 200, 500 });
		Cliente pedro = new Cliente("Pedro", new int[] { 100, 200, 500 });
		Cliente luisa = new Cliente("Luisa", new int[] { 100, 200, 500 });
		Dependiente de1 = new Dependiente("MARTA", 1);
		Dependiente de2 = new Dependiente("LORENA", 2);
		Dependiente de3 = new Dependiente("MARIA", 3);

		// instanciamos linea de caja
		Lineadecaja lineadecaja = new Lineadecaja();

		// agregamos dependientes a la linea de cajas
		lineadecaja.agregarDependiente(de1);
		lineadecaja.agregarDependiente(de2);
		lineadecaja.agregarDependiente(de3);

		// capturamos tiempo y agregamos clientes a la linea de cajas
		long tiempoInicio = System.currentTimeMillis();

		lineadecaja.nuevoCliente(manolo, tiempoInicio);
		lineadecaja.nuevoCliente(lola, tiempoInicio);
		lineadecaja.nuevoCliente(pepe, tiempoInicio);
		lineadecaja.nuevoCliente(luisa, tiempoInicio);
		lineadecaja.nuevoCliente(pedro, tiempoInicio);
		lineadecaja.nuevoCliente(antonio, tiempoInicio);

		// comprobamos si la cola ha finalizado y ninguna cajera atiende a nadie
		System.out.println("\n");
		System.out.println(lineadecaja.comprobarCola());
		System.out.println("\n");
		System.out.println(" Hay " + lineadecaja.getClientes() + " clientes en la cola");
		System.out.println("\n");
		System.out.println(" Cerramos el establecimiento y a descansar");
		System.out.println("\n");

	}
}
