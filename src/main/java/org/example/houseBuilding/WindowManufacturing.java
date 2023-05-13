package org.example.houseBuilding;

public class WindowManufacturing extends Thread {
    private BeginningOfWork beginningOfWork;

    public WindowManufacturing (BeginningOfWork beginningOfWork) {
        this.beginningOfWork = beginningOfWork;
    }

    @Override
    public void run() {
        try {
            beginningOfWork.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Window manufacturing in progress");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end Window");
    }
}
