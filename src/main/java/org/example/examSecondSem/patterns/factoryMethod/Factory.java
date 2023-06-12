package org.example.examSecondSem.patterns.factoryMethod;

public abstract class Factory {
    protected abstract Product createProduct();

    public void useProduct() {
        Product product = createProduct();
    }
}
