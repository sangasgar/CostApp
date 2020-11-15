package ru.atpv.myapplication;

public class Storage {
    private static int petrolCost;
    private static int productCost;
    private static int otherCost;
    public static Storage INSTANCE;
    private static Object ob = new Object();
    public Storage() {
        petrolCost = 0;
        productCost = 0;
        otherCost = 0;
    }
    private static Storage Singleton () {
        synchronized (ob) {
            if (INSTANCE == null) {
                INSTANCE = new Storage();

            }
            return INSTANCE;
        }
    }

    public synchronized void setPetrolCost(int petrolCost) {
        Storage.petrolCost = Storage.petrolCost + petrolCost;
    }

    public synchronized void setProductCost(int productCost) {
        Storage.productCost = Storage.productCost + productCost;
    }

    public synchronized void setOtherCost(int otherCost) {
        Storage.otherCost =   Storage.otherCost + otherCost;
    }


    public synchronized  int getPetrolCost() {
        return petrolCost;
    }

    public synchronized  int getProductCost() {
        return productCost;
    }

    public synchronized int getOtherCost() {
        return otherCost;
    }


}
