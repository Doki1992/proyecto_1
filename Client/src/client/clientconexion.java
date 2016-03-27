/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

/**
 *
 * @author Duglas
 */
import java.net.*;
import java.io.*;




public class clientconexion {
    
    
   
    Socket client;
    int port = 9000;
    String ip = "127.0.0.1";
    PrintStream out_C;
    BufferedReader in_C, key;
    
    public void begin(){
        
        try{
            
          
            client = new Socket(ip, port);
            in_C = new  BufferedReader (new InputStreamReader(client.getInputStream()));
            key = new BufferedReader (new InputStreamReader(System.in));
            String S_key= key.readLine();
            out_C = new PrintStream(client.getOutputStream());
            out_C.println(S_key);
            String msg = in_C.readLine();
            System.out.println(msg);
            
            
            in_C.close();
            out_C.close();
            key.close();
            client.close();
            
            
            
        }catch(Exception e){
            
        }
        
    }
    
}
