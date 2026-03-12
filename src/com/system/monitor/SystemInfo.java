package com.system.monitor;

public class SystemInfo {

    public static void show() {

        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
    }
}