package org.example.aisd;

import java.util.Random;

public class DeleteTimeMeter {
    private int[] randomArray;

    public void testDeleteOperation() {
        BinomialHeap heap = new BinomialHeap();
        Random rand = new Random();
        int[] removeValues = getRandomElementsThousandEl();

        long totalTime = 0;
        long totalOps = 0;
        for (int i = 0; i < removeValues.length; i++) {
            long startTime = System.nanoTime();
            heap.remove(removeValues[i]);
            long endTime = System.nanoTime();
            totalTime += endTime - startTime;
            totalOps += heap.getSize(); // Количество операций равно текущему размеру кучи
        }
        System.out.println("Среднее время на операцию удаления: " + totalTime / removeValues.length + " наносекунд");
        System.out.println("Среднее количество операций на удаление: " + totalOps / removeValues.length);
    }

    public int[] getRandomElementsThousandEl() {
        int[] selected = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < selected.length; i++) {
            selected[i] = randomArray[rand.nextInt(randomArray.length)];
        }

        return selected;
    }

    public void createRandomArray() {
        this.randomArray = new RandomArray().getRandomArray();
    }
}
