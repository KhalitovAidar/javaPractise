package org.example.threads;

import org.example.myclasses.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> stack = new Stack<>();
        arrayList.add(1);
        stack.add(1);
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; ++i) {
                    ++counter;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; ++i) {
                    ++counter;
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
