package com.company;

public class FuelConsumption {

    private int id;
    private String carBrand;
    private double consumption;

    public FuelConsumption(int id, String carBrand, double consumption) {
        this.id = id;
        this.carBrand = carBrand;
        this.consumption = consumption;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public double getConsumption() {
        return consumption;
    }

}
