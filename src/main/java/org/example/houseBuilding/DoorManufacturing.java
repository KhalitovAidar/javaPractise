package org.example.houseBuilding;

public class DoorManufacturing extends Thread {
    private BeginningOfWork beginningOfWork;
    public DoorManufacturing(BeginningOfWork beginningOfWork) {
        this.beginningOfWork = beginningOfWork;
    }

    @Override
    public void run() {
        try {
            beginningOfWork.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Door manufacturing");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
