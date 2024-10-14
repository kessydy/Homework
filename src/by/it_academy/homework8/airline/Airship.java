package by.it_academy.homework8.airline;

public class Airship extends Aircraft implements Hovering{

    public Airship(String name, int passengersCapacity, double liftingСapacity) {
        super(name, passengersCapacity, liftingСapacity);
    }

    @Override
    public void hover() {
        System.out.println("I can hovering above the ground!");
    }

    @Override
    public String toString() {
        return "Airship " +
                "name = '" + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingСapacity();
    }
}
