package org.example.houseBuilding;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BeginningOfWork beginningOfWork = new BeginningOfWork();
        beginningOfWork.start();

        WindowManufacturing windowManufacturing = new WindowManufacturing(beginningOfWork);
        DoorManufacturing doorManufacturing = new DoorManufacturing(beginningOfWork);
        BuildingFoundation buildingFoundation = new BuildingFoundation(beginningOfWork);

        windowManufacturing.start();
        doorManufacturing.start();
        buildingFoundation.start();

        LayingCommunications layingCommunications = new LayingCommunications(buildingFoundation);
        layingCommunications.start();

        Walling walling = new Walling(buildingFoundation);
        walling.start();

        Roofing roofing = new Roofing(walling);
        roofing.join();

        WindowInstallation windowInstallation = new WindowInstallation(windowManufacturing,
                roofing);
        windowInstallation.start();

        DoorInstallation doorInstallation = new DoorInstallation(doorManufacturing, roofing);
        doorInstallation.start();
    }
}
