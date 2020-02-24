package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FuelConsumption f1 = new FuelConsumption(1, "Audi", 7.5);
        FuelConsumption f2 = new FuelConsumption(2,"Renault", 5.5);
        FuelConsumption f3 = new FuelConsumption(3,"Skoda Kodiak",6.5);
        FuelConsumption f4 = new FuelConsumption(4, "Skoda Octavia",4.5);

        List<FuelConsumption> consumptionList = Arrays.asList(f1,f2,f3,f4);


        ConsumptionStream.listOfCars();
        System.out.println("Using foreach - AVG for all models with consumption > 6: " + ConsumptionStream.avgConsumptionForEach(consumptionList));
        System.out.println("Using streams - AVG for Skoda : " + ConsumptionStream.avgConsumptionStreams(consumptionList));

    }

}
