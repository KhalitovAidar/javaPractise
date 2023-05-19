package org.example.aisd;

public class AddTimeMeter {
    private int[] randomArray;

    public void testAddOperationForHundredEl() {
        BinomialHeap heap = new BinomialHeap();
        long totalTime = 0;
        long totalOps = 0;
        for (int i = 0; i < randomArray.length; i++) {
            long startTime = System.nanoTime();
            heap.add(randomArray[i]);
            long endTime = System.nanoTime();
            totalTime += endTime - startTime;
            totalOps += heap.getSize(); // Количество операций равно текущему размеру кучи
        }
        System.out.println("Среднее время на операцию добавления: " + totalTime /
                randomArray.length + " наносекунд");
        System.out.println("Среднее количество операций на добавление: " + totalOps /
                randomArray.length);
    }

    public void createRandomArray() {
        this.randomArray = new RandomArray().getRandomArray();
    }
}
