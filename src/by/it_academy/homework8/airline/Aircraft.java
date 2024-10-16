package by.it_academy.homework8.airline;

public class Aircraft {
//    Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//    Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//    Найти самолет в компании, соответствующий заданному диапазону параметров.

    private String name;
    private int passengersCapacity;
    private double liftingCapacity;


    public Aircraft(String name, int passengersCapacity, double liftingCapacity) {
        this.name = name;
        this.passengersCapacity = passengersCapacity;
        this.liftingCapacity = liftingCapacity;
    }

    public Aircraft(int passengersCapacity, double liftingCapacity) {
        this.passengersCapacity = passengersCapacity;
        this.liftingCapacity = liftingCapacity;
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public Aircraft(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public Aircraft(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public String getName() {
        return name;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public String toString() {
        return "Aircraft " +
                '\'' + name + '\'' +
                ", passengersCapacity = " + passengersCapacity +
                ", liftingCapacity = " + liftingCapacity;
    }
}