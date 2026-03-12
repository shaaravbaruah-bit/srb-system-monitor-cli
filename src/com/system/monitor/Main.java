package com.system.monitor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("==== Java System Monitor ====");
            System.out.println("1 System Information");
            System.out.println("2 CPU Information");
            System.out.println("3 Memory Information");
            System.out.println("4 Network Information");
            System.out.println("5 Disk Information");
            System.out.println("6 Export System Report");
            System.out.println("7 Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if(choice == 1) {
                SystemInfo.show();
            }

            else if(choice == 2) {
                CpuInfo.show();
            }

            else if(choice == 3) {
                MemoryInfo.show();
            }

            else if(choice == 4) {
                NetworkInfo.show();
            }

            else if(choice == 5) {
                DiskInfo.show();
            }

            else if(choice == 6) {
                ReportExporter.export();
            }

            else if(choice == 7) {
                System.out.println("Program exited.");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }

            System.out.println();
        }

        sc.close();
    }
}