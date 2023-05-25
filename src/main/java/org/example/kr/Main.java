package org.example.kr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        int n = 50;

        int[][] adjacencyMatrix = MatrixReader.read();
        int[][] symmetricMatrix = Symmetric.makeSymmetric(adjacencyMatrix);

        ExecutorService executorService = Executors.newFixedThreadPool(n);

        for (int i = 0; i < n; i++) {
            final int startNode = i + 1;
            int finalI = i;
            executorService.submit(() -> {
                int maxTime = 0;
                for (int j = 0; j < n; j++) {
                    if (j != finalI) {
                        int time = symmetricMatrix[startNode-1][j] * 1000;
                        try {
                            Thread.sleep(time);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Курьер из пункта " + startNode + " доставил посылку в пункт " + (j+1));
                        if (time > maxTime) {
                            maxTime = time;
                        }
                    }
                }

                System.out.println("Работа курьера из пункта " + startNode + " завершена. Время работы: " + maxTime/1000 + " сек.");
            });
        }

        executorService.shutdown();
    }
}

