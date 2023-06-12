package org.example.examSecondSem.patterns.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки для Windows");
    }
}
