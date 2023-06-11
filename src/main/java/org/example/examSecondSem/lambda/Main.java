package org.example.examSecondSem.lambda;

public class Main {

    public static void main(String[] args) {

        Operationable operation;
        operation = (x, y)-> x + y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30
    }
}

@FunctionalInterface
interface Operationable {
    int calculate(int x, int y);
}