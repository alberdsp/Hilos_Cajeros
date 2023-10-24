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
    
    // método para pasar el cliente al dependiente y tiempo de inicio
    
        public void setCliente_tiempo(Cliente cliente, long tiempo) {
          
            this.cliente = cliente;
            this.tiempo = tiempo;
        }
        
        // método para establecer si está libre la cajera
   public void setLibre(boolean libre) {
        	
        	this.libre = libre;
        	
        }
        
     
        
        // métod que vevuelve el nombre
     public String getnombre() {
        	
        	return this.nombre;
        	
        }
        
     // método que devuelve número de caja
        public int getNcaja() {
        	
        	return this.caja;
        	
        }
        
        // método para devolver si está libre la cajera  
     public boolean getLibre() {
        	
        	return this.libre;
        	
        }
        

        @Override
        public void run() {
        	
        	// ocupamos a la cajera para que no pasen clientes hasta que esté libre
        	this.libre = false;
        	 System.out.println("\n");
            System.out.println("Dependienta "+nombre+" en caja "+caja+" atendiendo a "+cliente.getNombre());
            System.out.println("------------------------------------------------------------------");            
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
            System.out.println("------------------------------------------------------------------");
            System.out.println("COMPRA DEL CLIENTE: "+cliente.getNombre()+" PROCESADA EN "+(System.currentTimeMillis()-tiempo)+"ms");
            System.out.println("------------------------------------------------------------------");
            // volvemos a liberar a la cajera
            this.libre = true;
            System.out.println("\n");
            System.out.println("Dependienta libre "+nombre+" en Caja "+caja);
            System.out.println("******************************************************************");
    }
        


}