package Tienda;


public class Main {
    public static void main(String[] args) {

        Cliente lola=new Cliente("lola",new int[] {200,400,300,200});
        Cliente pepe =new Cliente("pepe",new int[]{200,200,500,200,300});
        Cliente manolo =new Cliente("manolo",new int[]{100,200,500});

        Dependiente de1=new Dependiente("MARTA",1);
        Dependiente de2=new Dependiente("LORENA",2);

          long tiempoInicio= System.currentTimeMillis();
          
          // Creamos los hilos 
          Thread hilo1 = new Thread(de1);
          Thread hilo2 = new Thread(de2);


          de1.setCliente_tiempo(lola,tiempoInicio);
          de2.setCliente_tiempo(pepe,tiempoInicio);
        
          
         hilo1.start();
         hilo2.start();
          try  {
        	  if (hilo1.isInterrupted()) {
        		  System.out.println(" el hilo1 está interrimpido");	   
        		  
        	  }
        	  
        	  hilo1.join();
        	    
         de1.setCliente_tiempo(manolo,tiempoInicio);
         hilo1 = new Thread(de1);	
         hilo1.start();
           
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
          
        
        
          // Comprobamos si los hilos fueron finalizaron
          try {
        	  hilo1.join();
        	  hilo2.join();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          
    }
}
