package by.it_academy.homework8.airline;

import java.util.Arrays;

public class AirLine {
    //    Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//    Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//    Найти самолет в компании, соответствующий заданному диапазону параметров.
    private Aircraft[] aircrafts;

    public AirLine(Aircraft[] aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Aircraft[] getAircrafts() {
        return aircrafts;
    }

    public int getFullPassengersCapacity() {
        int fullPassengersCapacity = 0;
        for (Aircraft aircrafts : aircrafts) {
            fullPassengersCapacity += aircrafts.getPassengersCapacity();
        }
        return fullPassengersCapacity;
    }

    public double getFullLiftingCapacity() {
        double fullLiftingСapacity = 0;
        for (Aircraft aircrafts : aircrafts) {
            fullLiftingСapacity += aircrafts.getLiftingCapacity();
        }
        return fullLiftingСapacity;
    }

    @Override
    public String toString() {
        return "AirLine fleet: " + Arrays.toString(aircrafts);
    }

    public Aircraft findPlanePassengersCapacityLiftingCapacity(Aircraft o) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft");
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (o.getPassengersCapacity() <= aircraft.getPassengersCapacity() &&
                    o.getLiftingCapacity() <= aircraft.getLiftingCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlanePassengersCapacity(Aircraft o) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft");
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (o.getPassengersCapacity() <= aircraft.getPassengersCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlaneLiftingCapacity(Aircraft o) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft");
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (o.getLiftingCapacity() <= aircraft.getLiftingCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlaneName(Aircraft o) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft");
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (o.getName().equals(aircraft.getName())) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }
}





