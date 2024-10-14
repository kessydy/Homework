package by.it_academy.homework8.airline;

public class Quadcopter extends Aircraft implements Hovering {
    private boolean containsCamera;
    private double weigth;

    public Quadcopter(String name, int passengersCapacity, double liftingСapacity,
                      boolean containsCamera, double weigth) {
        super(name, passengersCapacity, liftingСapacity);
        this.containsCamera = containsCamera;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Quadcopter " +
                "name = '" + getName() + '\'' +
                ", passengersCapacity = " + getPassengersCapacity() +
                ", liftingСapacity = " + getLiftingСapacity() +
                ", containsCamera = " + containsCamera +
                ", weigth = " + weigth;
    }

    @Override
    public void hover() {
        System.out.println("I can hovering!");
    }
}


