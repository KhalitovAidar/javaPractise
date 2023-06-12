package org.example.examSecondSem.patterns.factoryMethod;

public class ConcreteProduct extends Product {
    @Override
    public void action() {
        System.out.println("Concrete action");
    }
}