package com.learning.java.JAVA.javaLibrariesNUtilities.cuncurrency;

public class Thread1 extends Thread {

    public void run() {
        System.out.println("Thread is started runninng...");
    }

    public static void main(String[] args) {

        Thread th1 = new Thread1();

        th1.run();

    }
}
