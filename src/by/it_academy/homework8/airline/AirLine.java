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
        for (Aircraft aircraft : aircrafts) {
            fullPassengersCapacity += aircraft.getPassengersCapacity();
        }
        return fullPassengersCapacity;
    }

    public double getFullLiftingCapacity() {
        double fullLiftingCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            fullLiftingCapacity += aircraft.getLiftingCapacity();
        }
        return fullLiftingCapacity;
    }

    @Override
    public String toString() {
        return "AirLine fleet: " + Arrays.toString(aircrafts);
    }

    public Aircraft findPlanePassengersCapacityLiftingCapacity(int lowerPassengersCapacity,
                                                               int higherPassengersCapacity,
                                                               double lowerLiftingCapacity,
                                                               double higherLiftingCapacity) {
        for (Aircraft aircraft : aircrafts) {
            if (lowerPassengersCapacity <= aircraft.getPassengersCapacity() &&
                    higherPassengersCapacity >= aircraft.getPassengersCapacity() &&
                    lowerLiftingCapacity <= aircraft.getLiftingCapacity() &&
                    higherLiftingCapacity >= aircraft.getLiftingCapacity()) {
                return aircraft;
            }
        }
        return null;
    }

    public Aircraft findPlanePassengersCapacity(int lowerPassengersCapacity, int higherPassengersCapacity) {
        for (Aircraft aircraft : aircrafts) {
            if (lowerPassengersCapacity <= aircraft.getPassengersCapacity() &&
                    higherPassengersCapacity >= aircraft.getPassengersCapacity()) {
                return aircraft;
            }
        }
        return null;
    }

    public Aircraft findPlaneLiftingCapacity(double lowerLiftingCapacity, double higherLiftingCapacity) {
        for (Aircraft aircraft : aircrafts) {
            if (lowerLiftingCapacity <= aircraft.getLiftingCapacity() &&
                    higherLiftingCapacity >= aircraft.getLiftingCapacity()) {
                return aircraft;
            }
        }
        return null;
    }

    public Aircraft findPlaneName(String name) {
        for (Aircraft aircraft : aircrafts) {
            if (name.equals(aircraft.getName())) {
                return aircraft;
            }
        } return null;
    }
}





