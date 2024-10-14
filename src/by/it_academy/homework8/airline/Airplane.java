package by.it_academy.homework8.airline;

public class Airplane extends Aircraft{

    public Airplane(String name, int passengersCapacity, double liftingСapacity) {
        super(name, passengersCapacity, liftingСapacity);
    }

    public Airplane(int passengersCapacity, double liftingСapacity) {
        super(passengersCapacity, liftingСapacity);
    }

    @Override
    public String toString() {
        return "Airplane " +
                "name = '" + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingСapacity();
    }
}
