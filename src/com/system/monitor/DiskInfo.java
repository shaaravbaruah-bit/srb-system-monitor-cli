package com.system.monitor;

import java.io.File;

public class DiskInfo {

    public static void show() {

        File disk = new File("/");

        long total = disk.getTotalSpace() / (1024 * 1024 * 1024);
        long free = disk.getFreeSpace() / (1024 * 1024 * 1024);

        System.out.println("Total Disk Space: " + total + " GB");
        System.out.println("Free Disk Space: " + free + " GB");
    }
}