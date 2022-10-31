package org.example;

public class Main {
    public static void main(String[] args) {

        Monitor monitor1 = Monitor.getMonitor();
        System.out.println(monitor1.hashCode());
        Monitor monitor2 = Monitor.getMonitor();
        System.out.println(monitor2.hashCode());


    }
}