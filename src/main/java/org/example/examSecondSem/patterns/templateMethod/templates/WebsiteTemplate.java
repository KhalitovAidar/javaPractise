package org.example.examSecondSem.patterns.templateMethod.templates;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        getBody();
        System.out.println("Footer");
    }
    public abstract void getBody();
}