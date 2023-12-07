package Q9_data_time;

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
            System.out.println("Date AND TIME OF SERVER IS  = " + msg);
        } catch (Exception e) {
            System.out.println("Exception occur " + e);
        }
    }
}