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

    public Aircraft findPlanePassengersCapacityLiftingCapacity(int lowerPassengersCapacity,
                                                               int higherPassengersCapacity,
                                                               double lowerLiftingCapacity,
                                                               double higherLiftingCapacity) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft", 0, 0);
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (lowerPassengersCapacity <= aircraft.getPassengersCapacity() &&
                    higherPassengersCapacity >= aircraft.getPassengersCapacity() &&
                    lowerLiftingCapacity <= aircraft.getLiftingCapacity() &&
                    higherLiftingCapacity >= aircraft.getLiftingCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlanePassengersCapacity(int lowerPassengersCapacity, int higherPassengersCapacity) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft", 0, 0);
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (lowerPassengersCapacity <= aircraft.getPassengersCapacity() &&
                    higherPassengersCapacity >= aircraft.getPassengersCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlaneLiftingCapacity(double lowerLiftingCapacity, double higherLiftingCapacity) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft", 0, 0);
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (lowerLiftingCapacity <= aircraft.getLiftingCapacity() &&
                    higherLiftingCapacity >= aircraft.getLiftingCapacity()) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }

    public Aircraft findPlaneName(String name) {
        Aircraft aircraftNeeded = new Aircraft("There is no right aircraft", 0, 0);
        String[] findPlane = new String[aircrafts.length];
        for (Aircraft aircraft : aircrafts) {
            if (name.equals(aircraft.getName())) {
                aircraftNeeded = aircraft;
            }
        }
        return aircraftNeeded;
    }
}





