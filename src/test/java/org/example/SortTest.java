package org.example;

import org.example.myclasses.sorts.QuickSort;
import org.junit.Assert;
import org.junit.Test;
public class SortTest {
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();

        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int[] expected = {1, 5, 7, 8, 9, 10};

        int[] sortedArray = quickSort.quicksort(arr);

        Assert.assertArrayEquals(expected, sortedArray);
    }
}
