package org.example.houseBuilding;

public class Walling extends Thread {
    private BuildingFoundation buildingFoundation;
    public Walling(BuildingFoundation buildingFoundation) {
        this.buildingFoundation = buildingFoundation;
    }
    @Override
    public void run() {
        System.out.println("Walling");
        try {
            buildingFoundation.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
