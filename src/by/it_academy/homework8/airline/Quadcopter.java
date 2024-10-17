package by.it_academy.homework8.airline;

public class Quadcopter extends Aircraft implements Hovering {
    private boolean containsCamera;
    private double weigth;

    public Quadcopter(String name, int passengersCapacity, double liftingCapacity,
                      boolean containsCamera, double weigth) {
        super(name, passengersCapacity, liftingCapacity);
        this.containsCamera = containsCamera;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Quadcopter " +
                '\'' + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingCapacity() +
                ", containsCamera = " + containsCamera +
                ", weigth = " + weigth;
    }

    @Override
    public void hover() {
        System.out.println("I can hovering!");
    }
}


