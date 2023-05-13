package org.example.houseBuilding;

public class Roofing extends Thread {
    private Walling walling;

    public Roofing(Walling walling) {
        this.walling = walling;
    }
    @Override
    public void run() {
        try {
            walling.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Roofing");
    }
}
