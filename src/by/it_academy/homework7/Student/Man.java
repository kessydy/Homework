package by.it_academy.homework7.Student;

public class Man {
    private String name;
    private int age;
    private String gender;
    private float weigth;

    public Man(String name, int age, float weigth) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public String printStudent() {
        return "Student " + getName() + ", " + getAge() + " years old, " + getWeigth() + " kg.";
    }
}
