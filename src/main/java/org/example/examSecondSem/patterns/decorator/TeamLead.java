package org.example.examSecondSem.patterns.decorator;

import java.util.LinkedList;

public class TeamLead extends JavaDeveloper {
    private JavaDeveloper javaDeveloper;

    public TeamLead(JavaDeveloper javaDeveloper) {
        this.javaDeveloper = javaDeveloper;
    }
    @Override
    public String makeJob() {
        return javaDeveloper.makeJob() + reviewCode();
    }

    public String reviewCode() {
        return "Code reviewed.";
    }
    // array[1, 2, 3] - array[1]
    // linkedlist head 1 -> 2 -> 5 -> 3 -> null
}
