package com.system.monitor;

import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;

public class ReportExporter {

    public static void export() {

        try {

            FileWriter writer = new FileWriter("system_report.txt");

            writer.write("===== SYSTEM REPORT =====\n\n");

            writer.write("OS: " + System.getProperty("os.name") + "\n");
            writer.write("OS Version: " + System.getProperty("os.version") + "\n");
            writer.write("User: " + System.getProperty("user.name") + "\n");
            writer.write("Java Version: " + System.getProperty("java.version") + "\n\n");

            int cpu = Runtime.getRuntime().availableProcessors();
            writer.write("CPU Cores: " + cpu + "\n\n");

            long totalMem = Runtime.getRuntime().totalMemory() / (1024 * 1024);
            long freeMem = Runtime.getRuntime().freeMemory() / (1024 * 1024);

            writer.write("Total Memory: " + totalMem + " MB\n");
            writer.write("Free Memory: " + freeMem + " MB\n\n");

            InetAddress ip = InetAddress.getLocalHost();

            writer.write("Host Name: " + ip.getHostName() + "\n");
            writer.write("IP Address: " + ip.getHostAddress() + "\n");

            writer.close();

            System.out.println("System report saved to system_report.txt");

        }

        catch(IOException e) {
            System.out.println("Error writing report.");
        }
    }
}