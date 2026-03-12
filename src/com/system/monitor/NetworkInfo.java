package com.system.monitor;

import java.net.InetAddress;

public class NetworkInfo {

    public static void show() {

        try {

            InetAddress ip = InetAddress.getLocalHost();

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        }

        catch(Exception e) {
            System.out.println("Unable to get network info.");
        }
    }
}