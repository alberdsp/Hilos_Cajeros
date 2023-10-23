package Tienda;

public class Dependiente implements Runnable {

    private String nombre; // nombre del/ la cajera
    private Cliente cliente; // clase cliente 
    private int caja;  // número de caja
    private boolean libre = true; // indica si la cajera está libre
    private long tiempo;
    
     // constructor para crear el dependiente y asignar caja
    public Dependiente (String nombre,int caja){

        this.nombre=nombre;
        this.caja = caja;
         }
    
    // métodor para pasar el cliente al dependiente y tiempo de inicio
    
        public void setCliente_tiempo(Cliente cliente, long tiempo) {
          
            this.cliente = cliente;
            this.tiempo = tiempo;
        }
     
        public int getNcaja() {
        	
        	return this.caja;
        	
        }

        @Override
        public void run() {
        	
        	// ocupamos a la cajera para que no pasen clientes hasta que esté libre
        	this.libre = false;
        
            System.out.println("Dependienta "+nombre+" en caja "+caja+" atendiendo a "+cliente.nombre);

            for(int i=0;i<cliente.getCompra().length;i++){
                 
                try {
                    Thread.sleep(cliente.getCompra()[i]);

                    //

                    System.out.println("PRODUCTO " + (i + 1) + " "+" pasa por caja "+caja+" en " + (System.currentTimeMillis()-tiempo)+"ms");


                } catch (InterruptedException ex) {
                	//
                    Thread.currentThread().interrupt();
                }

            }

            System.out.println("COMPRA DEL CLIENTE PROCESADA EN "+(System.currentTimeMillis()-tiempo)+"ms");
            // volvemos a liberar a la cajera
            this.libre = true;
            System.out.println("Dependienta libre ="+nombre+"  "+libre);
    }
        


}