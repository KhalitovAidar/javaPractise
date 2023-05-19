package org.example.aisd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AddTimeMeter addTimeMeter = new AddTimeMeter();
        addTimeMeter.createRandomArray();
        addTimeMeter.testAddOperationForHundredEl();

        FindTimeMeter findTimeMeter = new FindTimeMeter();
        findTimeMeter.createRandomArray();
        findTimeMeter.testFindOperationForHundredEl();

        DeleteTimeMeter deleteTimeMeter = new DeleteTimeMeter();
        deleteTimeMeter.createRandomArray();
        deleteTimeMeter.testDeleteOperation();
    }
}
