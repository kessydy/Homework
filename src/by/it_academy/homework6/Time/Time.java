package by.it_academy.homework6.Time;

public class Time {
//    Создать класс описывающий промежуток времени.
//    Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов.
//    Создать два конструктора:
//    - получающий общее количество секунд
//    - получающий часы, минуты, секунды по отдельности.
//    Сделать метод для вывода данных.

    private int seconds;
    private int minutes;
    private int hours;

    public int fullSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }

    public boolean equalsTime(Time timeToCompare) {
        int fullSeconds1 = this.seconds + this.minutes * 60 + this.hours * 3600;
        int fullSeconds2 = timeToCompare.seconds + timeToCompare.minutes * 60 + timeToCompare.hours * 3600;
        return fullSeconds1 == fullSeconds2;
    }

    public Time(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = seconds % 60;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void printTime() {
        System.out.println(hours + "  hours " + minutes + " minutes " + seconds + " seconds ");
    }
}