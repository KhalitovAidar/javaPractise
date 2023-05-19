package org.example.aisd;

import java.util.Random;

public class FindTimeMeter {
    private int[] randomArray;

    public void testFindOperationForHundredEl() {
        BinomialHeap heap = new BinomialHeap();
        Random rand = new Random();
        int[] searchValues = getRandomElementsHundredEl();

        long totalTime = 0;
        long totalOps = 0;
        for (int i = 0; i < searchValues.length; i++) {
            long startTime = System.nanoTime();
            boolean found = heap.contains(searchValues[i]);
            long endTime = System.nanoTime();
            totalTime += endTime - startTime;
            totalOps += heap.getSize(); // Количество операций равно текущему размеру кучи
            System.out.println("Элемент " + searchValues[i] + " найден: " + found);
        }
        System.out.println("Среднее время на операцию поиска: " + totalTime / searchValues.length + " наносекунд");
        System.out.println("Среднее количество операций на поиск: " + totalOps / searchValues.length);
    }

    public int[] getRandomElementsHundredEl() {
        int[] selected = new int[100];
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
