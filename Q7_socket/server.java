package Q7_socket;

import java.net.*;
import java.io.*;
public class server {
    public static void main(String[] args) {
        try{
            ServerSocket ss= new ServerSocket(2122);
            System.out.println("Server is waiting for client to connect");
            Socket s=ss.accept();
            System.out.println("client connect");
            DataInputStream ip= new DataInputStream(s.getInputStream()); 
            DataOutputStream op= new DataOutputStream(s.getOutputStream());
            String msg="Welcome Client";
            op.writeUTF(msg);
            msg=ip.readUTF();
            System.out.println("msg by client = "+msg);
             while(!(msg.equalsIgnoreCase("stop"))){
           msg= ip.readUTF();
                 System.out.print(" "+msg);
        }
        }catch(Exception e){
            System.out.println("Exception occur "+e);  
    }
    }
}