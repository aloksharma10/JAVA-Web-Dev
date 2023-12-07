package Q8_inetAddress;

import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2122);
            Socket s = ss.accept();
            DataInputStream ip = new DataInputStream(s.getInputStream());
            DataOutputStream op = new DataOutputStream(s.getOutputStream());

        } catch (Exception e) {
            System.out.println("Exception occur " + e);
        }
    }
}