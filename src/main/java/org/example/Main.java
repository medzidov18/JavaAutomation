package org.example;

import java.beans.Transient;

public class Main {

    public static void main(String[] args) {
        MyCustomThread thread1 = new MyCustomThread();
        MyCustomThread thread2 = new MyCustomThread();

        thread1.start();
        thread2.start();
    }
}