package Tienda;

public class Cliente {

    private   int[] compra;
    private   String nombre;

    public Cliente(String nombre, int[] compra) {
        this.nombre=nombre;
        this.compra=compra;
    }

    public  int[] getCompra(){
        return compra;
    }
    
    public String getNombre() {
    	
    	return this.nombre;
    }

    public void setCompra(int [] compra){
        this.compra=compra;
    }


}
