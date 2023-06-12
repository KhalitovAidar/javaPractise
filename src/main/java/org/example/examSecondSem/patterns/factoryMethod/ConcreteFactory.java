package org.example.examSecondSem.patterns.factoryMethod;

public class ConcreteFactory extends Factory {
    @Override
    protected Product createProduct() {
        return new ConcreteProduct();
    }
}
