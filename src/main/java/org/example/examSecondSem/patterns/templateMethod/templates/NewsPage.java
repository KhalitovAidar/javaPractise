package org.example.examSecondSem.patterns.templateMethod.templates;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void getBody() {
        System.out.println("News Body");
    }
}
