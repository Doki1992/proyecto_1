/*
 * To change this license header, choose License Headers in_S Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in_S the editor.
 */

package server;

/**
 *
 * @author Duglas
 */


import java.net.*;
import java.io.*;




public class serverconexion {
    
    
    ServerSocket server;
    Socket socket;
    int port = 9000;
    DataOutputStream out_S;
    BufferedReader in_S;
    
    public void begin(){
        
        try{
            
            server = new ServerSocket(port);
            socket = new Socket();
            socket = server.accept();
            String message="";
            
            while(!message.equals("salir")){
            in_S = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            message = in_S.readLine();
            System.out.println(message);
            }
            out_S = new DataOutputStream(socket.getOutputStream());
            out_S.writeUTF("Close");
            
            server.close();
            socket.close();
            
            
        }catch(Exception e){
            
        }
        
    }
    
}
