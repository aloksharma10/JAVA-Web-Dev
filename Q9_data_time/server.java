package Q9_data_time;

import java.net.*;
import java.io.*;
import java.util.Date;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2122);
            System.out.println("Server is waiting for client to connect");
            Socket s = ss.accept();
            System.out.println("client connect");
            DataInputStream ip = new DataInputStream(s.getInputStream());
            DataOutputStream op = new DataOutputStream(s.getOutputStream());
            op.writeUTF(new Date() + "");
        } catch (Exception e) {
            System.out.println("Exception occur " + e);
        }
    }
}
