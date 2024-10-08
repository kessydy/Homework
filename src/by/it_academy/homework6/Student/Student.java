package by.it_academy.homework6.Student;

public class Student extends Man {
    private int yearOfStudy;

    public Student(String name, int age, float weigth, int yearOfStudy) {
        super(name, age, weigth);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int addYear() {
        this.yearOfStudy++;
        return this.yearOfStudy;
    }

    public String printStudent() {
        return "Student " + super.getName() + ", " + super.getAge() + " years old ," + super.getWeigth() + " kg. " + getYearOfStudy() + " yeas of study.";
    }

}
