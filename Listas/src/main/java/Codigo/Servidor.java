package Codigo;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    NodoWeb InicioLista = null;
    NodoWeb FinLista = null;
    
    public void imprimir(){
        try {
            NodoWeb correr = InicioLista;
            while(correr!=null){
                correr.imprimir();
                correr = correr.sig;
            }
        } catch (Exception e) {
        }
    }

    public Servidor(){
        try {
            ServerSocket ss = new ServerSocket(90);
            InputStream entrada = cl1.getInputStream();
            DataInputStream entra = new DataInputStream(entrada);
            String leido = entra.readUTF();
            System.out.println("Cliente dijo: "+ leido);
            while(true){
                Socket cl1 = ss.accept();
                if(InicioLista == null){
                    NodoWeb c = new NodoWeb();
                    c.mensaje = cl1.toString();
                    InicioLista = c;
                    FinLista = c;
                }else {
                    NodoWeb c = new NodoWeb();
                    FinLista.sig = c;
                    FinLista = c;
                }
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
    }
    
}
