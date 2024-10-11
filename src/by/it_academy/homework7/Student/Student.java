package by.it_academy.homework7.Student;

public class Student extends Man {
    private int yearOfStudy;

    public Student(String name, int age, String gender, float weigth, int yearOfStudy) {
        super(name, age, gender, weigth);
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int addYear() {
        return this.yearOfStudy++;
    }

    @Override
    public String toString() {
        return "Student " + getName() +
                ", age = " + getAge() + " years old, " +
                "gender = '" + getGender() + '\'' +
                ", weigth = " + getWeigth() + " kg, " +
                yearOfStudy + " year of study.";
    }
}
