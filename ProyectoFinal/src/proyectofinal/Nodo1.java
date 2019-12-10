package proyectofinal;
/**
 * 
 */
public class Nodo1 {
    private int valor;
    
    private Nodo1 siguiente;
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public Nodo1 getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo1 siguiente){
        this.siguiente = siguiente;
    }
}