package by.it_academy.homework8.airline;

public class Airplane extends Aircraft{

    public Airplane(String name, int passengersCapacity, double liftingСapacity) {
        super(name, passengersCapacity, liftingСapacity);
    }

    public Airplane(int passengersCapacity, double liftingCapacity) {
        super(passengersCapacity, liftingCapacity);
    }



    @Override
    public String toString() {
        return "Airplane " +
                '\'' + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingCapacity();
    }
}
