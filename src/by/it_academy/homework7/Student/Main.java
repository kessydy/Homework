package by.it_academy.homework7.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alla", 19, 46.5F,  1);
        student1.setWeigth(48.4F);
        student1.setName("Alla Beckman");
        student1.addYear();
        System.out.println(student1.printStudent());
    }
}
