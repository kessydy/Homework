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

    public double getFullLiftingСapacity() {
        double fullLiftingСapacity = 0;
        for (Aircraft aircrafts : aircrafts) {
            fullLiftingСapacity += aircrafts.getLiftingСapacity();
        }
        return fullLiftingСapacity;
    }

    @Override
    public String toString() {
        return "AirLine fleet: " + Arrays.toString(aircrafts);
    }

    public void FindPlane(Aircraft o) {
        String[] PassengersCapacity = new String[aircrafts.length];
        for (int i = 0; i < aircrafts.length; i++) {
            if (o.getPassengersCapacity() <= aircrafts[i].getPassengersCapacity() && (o.getLiftingСapacity() <= aircrafts[i].getLiftingСapacity())) {
                String neccesaryAircraft = aircrafts[i].getName();
                System.out.println(neccesaryAircraft);
            }
        }
    }
}

