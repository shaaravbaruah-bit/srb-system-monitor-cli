package com.system.monitor;

public class CpuInfo {

    public static void show() {

        int cpu = Runtime.getRuntime().availableProcessors();

        System.out.println("Available CPU Cores: " + cpu);
    }
}