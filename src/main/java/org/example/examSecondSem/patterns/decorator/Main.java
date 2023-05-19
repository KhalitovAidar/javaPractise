package org.example.examSecondSem.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        TeamLead teamLead = new TeamLead(javaDeveloper);

        System.out.println(javaDeveloper.makeJob());
        System.out.println(teamLead.makeJob());
    }
}
