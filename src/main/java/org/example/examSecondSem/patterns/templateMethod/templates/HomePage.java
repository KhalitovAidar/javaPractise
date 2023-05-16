package org.example.examSecondSem.patterns.templateMethod.templates;

public class HomePage extends WebsiteTemplate {
    @Override
    public void getBody() {
        System.out.println("Home Body");
    }
}
