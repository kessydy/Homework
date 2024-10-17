package by.it_academy.homework8.airline;

public class Airplane extends Aircraft{

    public Airplane(String name, int passengersCapacity, double liftingCapacity) {
        super(name, passengersCapacity, liftingCapacity);
    }

    @Override
    public String toString() {
        return "Airplane " +
                '\'' + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingCapacity = " + getLiftingCapacity();
    }
}
