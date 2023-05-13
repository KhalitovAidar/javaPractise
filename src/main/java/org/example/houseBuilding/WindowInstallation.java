package org.example.houseBuilding;

public class WindowInstallation extends Thread {
    private WindowManufacturing windowManufacturing;
    private Roofing roofing;

    public WindowInstallation(WindowManufacturing windowManufacturing,
                              Roofing roofing) {
        this.windowManufacturing = windowManufacturing;
        this.roofing = roofing;
    }
    @Override
    public void run() {

        try {
            windowManufacturing.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            roofing.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Window installation");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
