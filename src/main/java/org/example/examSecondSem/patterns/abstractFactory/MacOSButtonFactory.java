package org.example.examSecondSem.patterns.abstractFactory;

public class MacOSButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
