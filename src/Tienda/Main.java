package Tienda;


public class Main {
    public static void main(String[] args) {

        Cliente lola=new Cliente("Lola",new int[] {200,400,300,200});
        Cliente pepe =new Cliente("Pepe",new int[]{200,200,500,200,300});
        Cliente manolo =new Cliente("Manolo",new int[]{100,200,500});
        Cliente antonio =new Cliente("Antonio",new int[]{100,200,500});
        Cliente pedro =new Cliente("Pedro",new int[]{100,200,500});
        Cliente luisa =new Cliente("Luisa",new int[]{100,200,500});
        Dependiente de1=new Dependiente("MARTA",1);
        Dependiente de2=new Dependiente("LORENA",2);
        Dependiente de3=new Dependiente("MARIA",3);
        
       
        Lineadecaja lineadecaja = new Lineadecaja();
        
        lineadecaja.agregarDependiente(de1);
        
        lineadecaja.agregarDependiente(de2);
        lineadecaja.agregarDependiente(de3);
        
          long tiempoInicio= System.currentTimeMillis();
          
          
        lineadecaja.nuevoCliente(manolo, tiempoInicio);  
        lineadecaja.nuevoCliente(lola, tiempoInicio);  
        lineadecaja.nuevoCliente(pepe, tiempoInicio);
        lineadecaja.nuevoCliente(luisa, tiempoInicio);
        lineadecaja.nuevoCliente(pedro, tiempoInicio);
        lineadecaja.nuevoCliente(antonio, tiempoInicio);
        
        while (lineadecaja.getClientes()>0) {
        	
        
  			  System.out.println("\n");
  			  System.out.println(" Hay "+ lineadecaja.getClientes()+" clientes en la cola");
  			  System.out.println("\n");
  			  
  			  }	
        	
        

        
        
    }
}
