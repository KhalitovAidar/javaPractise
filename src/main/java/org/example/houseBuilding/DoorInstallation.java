package org.example.houseBuilding;

public class DoorInstallation extends Thread {
    private DoorManufacturing doorManufacturing;
    private Roofing roofing;

    public DoorInstallation(DoorManufacturing doorManufacturing,
                            Roofing roofing){
        this.doorManufacturing = doorManufacturing;
        this.roofing = roofing;
    }
    @Override
    public void run() {

        try {
            doorManufacturing.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            roofing.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Door installation");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
