package by.it_academy.homework8.airline;

public class Helicopter extends Aircraft implements Hovering{

    public Helicopter(String name, int passengersCapacity, double liftingСapacity) {
        super(name, passengersCapacity, liftingСapacity);
    }

    @Override
    public void hover() {
        System.out.println("I can hovering!");
    }

    @Override
    public String toString() {
        return "Helicopter " +
                "name = '" + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingСapacity();
    }
}

