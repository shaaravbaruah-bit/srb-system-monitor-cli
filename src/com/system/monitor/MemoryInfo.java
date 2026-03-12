package com.system.monitor;

public class MemoryInfo {

    public static void show() {

        Runtime runtime = Runtime.getRuntime();

        long total = runtime.totalMemory() / (1024 * 1024);
        long free = runtime.freeMemory() / (1024 * 1024);
        long used = total - free;

        System.out.println("Total Memory: " + total + " MB");
        System.out.println("Free Memory: " + free + " MB");
        System.out.println("Used Memory: " + used + " MB");
    }
}