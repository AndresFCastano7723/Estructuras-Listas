package Codigo;

public class NodoWeb {
    public String mensaje = "";
    public NodoWeb sig = null;
    
    public NodoWeb(){
    }
    
    public void imprimir(){
        System.out.println(mensaje);
    }
}
