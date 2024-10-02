package by.it_academy.homework6;

public class Time {
//    Создать класс описывающий промежуток времени.
//    Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов.
//    Создать два конструктора:
//    получающий общее количество секунд
//    получающий часы, минуты, секунды по отдельности.
//    Сделать метод для вывода данных.

    private int seconds;
    private int minutes;
    private int hours;

    public Time fullSeconds() {
        int fullSeconds = this.seconds + this.minutes * 60 + this.hours * 3600;
        Time fullSecondsInTime = new Time(fullSeconds);
        return fullSecondsInTime;
    }

    public void compareTime(Time timeToCompare) {
        int fullSeconds1 = this.seconds + this.minutes * 60 + this.hours * 3600;
        int fullSeconds2 = timeToCompare.seconds + timeToCompare.minutes * 60 + timeToCompare.hours * 3600;
        if (fullSeconds1 > fullSeconds2) {
            System.out.println("The first object is bigger");
        } else {
            System.out.println("The second object is bigger");
        }
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void printTime() {
        System.out.println(seconds);
    }
}
