package by.it_academy.homework8.airline;

public abstract class Aircraft {
//    Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//    Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//    Найти самолет в компании, соответствующий заданному диапазону параметров.

    private String name;
    private int passengersCapacity;
    private double liftingСapacity;


    public Aircraft(String name, int passengersCapacity, double liftingСapacity) {
        this.name = name;
        this.passengersCapacity = passengersCapacity;
        this.liftingСapacity = liftingСapacity;
    }

    public Aircraft(int passengersCapacity, double liftingСapacity) {
        this.passengersCapacity = passengersCapacity;
        this.liftingСapacity = liftingСapacity;
    }

    public String getName() {
        return name;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public double getLiftingСapacity() {
        return liftingСapacity;
    }

    @Override
    public String toString() {
        return "Aircraft " +
                "name = '" + name + '\'' +
                ", passengersCapacity = " + passengersCapacity +
                ", liftingСapacity = " + liftingСapacity;
    }
}