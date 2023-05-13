package org.example.myclasses.sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class QuickSort {
        public static int[] quicksort(int[] arr) {
            if (arr == null || arr.length == 0) {
                return new int[0];
            }
            return quicksort(arr, 0, arr.length - 1);
        }

        private static int[] quicksort(int[] arr, int left, int right) {
            int pivot = arr[left + (right - left) / 2];
            int i = left;
            int j = right;
            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }
                while (arr[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }
            if (left < j) {
                quicksort(arr, left, j);
            }
            if (i < right) {
                quicksort(arr, i, right);
            }
            return arr;
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
