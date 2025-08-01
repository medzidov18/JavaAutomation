package org.example;

public class MyCustomThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
