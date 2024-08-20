package Codigo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {
    public Cliente(){
        try {
            Socket ss = new ServerSocket(90);
            OutputStream entrada = cl1.getOutputStream();
            DataOutputStream entra = new DataOutputStream(entrada);
        } catch (Exception e) {
        }
    }
}
