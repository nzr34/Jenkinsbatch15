package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello world 2!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}