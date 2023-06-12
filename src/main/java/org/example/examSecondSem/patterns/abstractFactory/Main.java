package org.example.examSecondSem.patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        ButtonFactory bf = new MacOSButtonFactory();
        bf.createButton().render();
    }
}
