package org.example.houseBuilding;

public class Project extends Thread {
    @Override
    public void run() {
        System.out.println("Planning in progress");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("end Planning");
        
    }
}
