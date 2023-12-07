package Q8_inetAddress;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 2122);
            DataInputStream ip = new DataInputStream(s.getInputStream());
            DataOutputStream op = new DataOutputStream(s.getOutputStream());

            InetAddress hostIPAddress = InetAddress.getLocalHost();
            System.out.println(
                    "I.P Address of Localhost by  InetAddress.getLocalHost() is " + hostIPAddress.getAddress());
            System.out.println("I.P Address of Youtube Website  is " + hostIPAddress);
            InetAddress hostname = InetAddress.getByName("www.youtube.com");
            System.out.println("I.P Address of LocalHost  is " + hostname);
            InetAddress hostname1 = InetAddress.getByName("localhost");
            System.out.println("I.P Address of LocalHost by  InetAddress.getByName(localhost) Method is " + hostname1);

        } catch (Exception e) {
            System.out.println("Exception occur " + e);
        }
    }
}