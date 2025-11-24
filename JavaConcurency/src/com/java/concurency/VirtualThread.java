package com.java.concurency;

import java.util.ArrayList;
import java.util.List;

public class VirtualThread {

    public static void main(String[] args) {
        List<Thread> vThreads = new ArrayList<>();

        int vThreadsCnt = 100_000;

        for (int i = 0; i < vThreadsCnt; i++) {
            int vThreadIndx = i;
            Thread vThread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for (int j = 0; j < 10; j++) {
                    result *= (j + 1);
                }
                System.out.println("Result [" + vThreadIndx + "] : " + result);
            });

            vThreads.add(vThread);

        }

        for (Thread vThread : vThreads) {
            try {
                vThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
