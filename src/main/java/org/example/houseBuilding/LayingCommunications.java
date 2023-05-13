package org.example.houseBuilding;

public class LayingCommunications extends  Thread {
    private BuildingFoundation buildingFoundation;
    public LayingCommunications(BuildingFoundation buildingFoundation) {
        this.buildingFoundation = buildingFoundation;
    }

    @Override
    public void run() {
        try {
            buildingFoundation.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Laying communications");


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
