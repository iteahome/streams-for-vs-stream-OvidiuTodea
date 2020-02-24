package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsumptionStream {

    public static void listOfCars(){
        Stream<String> stream = Stream.of("Audi", "Renault", "Skoda Kodiak", "Skoda Octavia");
        String list = stream.filter(string -> !string.isEmpty()).collect(Collectors.joining(" ; "));
        System.out.println("The list of car models: " + list);
    }


    public static double avgConsumptionForEach(List<FuelConsumption> fuelConsumptionList) {
        int count = 0;
        double quantity = 0;
        for (FuelConsumption consumption :  fuelConsumptionList) {
            if (consumption.getConsumption() > 6) {
                quantity += consumption.getConsumption();
                count ++;
            }
        }

        return quantity / count;
    }


    public static double avgConsumptionStreams(List<FuelConsumption> fuelConsumptionList) {
        return fuelConsumptionList.stream()
                .filter(fc -> fc.getConsumption() > 4)
                .filter(fc -> fc.getCarBrand().contains("Skoda"))
                .mapToDouble(fc-> fc.getConsumption())
                .average()
                .orElse(0);
    }



}
