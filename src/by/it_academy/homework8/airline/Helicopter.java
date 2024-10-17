package by.it_academy.homework8.airline;

public class Helicopter extends Aircraft implements Hovering{

    public Helicopter(String name, int passengersCapacity, double liftingCapacity) {
        super(name, passengersCapacity, liftingCapacity);
    }

    @Override
    public void hover() {
        System.out.println("I can hovering!");
    }

    @Override
    public String toString() {
        return "Helicopter " +
                '\'' + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingCapacity = " + getLiftingCapacity();
    }
}

