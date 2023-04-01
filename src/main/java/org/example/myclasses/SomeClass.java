package org.example.myclasses;

public class SomeClass {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class SecondSomeClass {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.getX());
        System.out.println(someClass.getY());
    }
}
