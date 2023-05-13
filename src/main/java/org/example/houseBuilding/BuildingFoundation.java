package org.example.houseBuilding;

public class BuildingFoundation extends Thread {
    private BeginningOfWork beginningOfWork;
    public BuildingFoundation(BeginningOfWork beginningOfWork) {
        this.beginningOfWork = beginningOfWork;
    }

    @Override
    public void run() {

        try {
            beginningOfWork.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Building foundation");

        try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
