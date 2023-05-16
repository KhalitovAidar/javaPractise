package org.example.examSecondSem.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new AmericanSocketImpl();
        EuroSocket socketAdapter = new SocketAdapter(americanSocket);

        TV tv = new TV();
        tv.connectToSocket(socketAdapter);
    }
}
