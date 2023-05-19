package org.example.aisd;

import java.util.Random;

public class RandomArray {
    private int[] randomArray;

    public RandomArray() {
        this.randomArray = createRandomArray();
    }

    private int[] createRandomArray() {
        int[] arr = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }

        return arr;
    }
    public int[] getRandomArray() {
        return randomArray;
    }
}
