package Codigo;


public class Listas {
    
  public Listas(){
      Nodo nodin1 = new Nodo();
      Nodo nodin2 = new Nodo();
      Nodo nodin3 = new Nodo();
      Nodo nodin4 = new Nodo();
      
      nodin1.nombre = "P1";
      nodin2.nombre = "P2";
      nodin3.nombre = "P3";
      nodin4.nombre = "P4";
      
      nodin1.sig = nodin2;
      nodin2.sig = nodin3;
      nodin3.sig = nodin4;
      
      Nodo inicio = null;
      inicio = nodin1;
      
      while(inicio != null){
          inicio.imprimir();
          inicio = inicio.sig;
      }
  }

    public static void main(String[] args) {
        Listas ls = new Listas();
    }
}
