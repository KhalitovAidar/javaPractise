package org.example.examSecondSem.patterns.templateMethod;

import org.example.examSecondSem.patterns.templateMethod.templates.HomePage;
import org.example.examSecondSem.patterns.templateMethod.templates.NewsPage;
import org.example.examSecondSem.patterns.templateMethod.templates.WebsiteTemplate;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate homePage = new HomePage();
        WebsiteTemplate newsPage = new NewsPage();

        homePage.showPage();
        System.out.println("\n------------------------------\n");
        newsPage.showPage();
    }
}
