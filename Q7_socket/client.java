package Q7_socket;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 2122);
            DataInputStream ip = new DataInputStream(s.getInputStream());
            DataOutputStream op = new DataOutputStream(s.getOutputStream());
            String msg = ip.readUTF();
            System.out.println("msg by server = " + msg);
            msg = "Thankyou Server";
            op.writeUTF(msg);
            Scanner sc = new Scanner(System.in);
            while (!(msg.equalsIgnoreCase("stop"))) {
                msg = sc.next();
                op.writeUTF(msg);
            }
        } catch (Exception e) {
            System.out.println("Exception occur " + e);
        }
    }
}