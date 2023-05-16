package org.example.examSecondSem.patterns.adapter;

public class AmericanSocketImpl implements AmericanSocket{
    @Override
    public void getPower() {
        System.out.println("110 volt powered");
    }
}
