package org.example.examSecondSem.patterns.abstractFactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисовка для Mac");
    }
}
