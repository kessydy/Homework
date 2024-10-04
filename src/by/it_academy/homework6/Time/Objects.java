package by.it_academy.homework6.Time;

public class Objects {
    public static void main(String[] args) {
        Time time1 = new Time(31, 5, 8);
        time1.printTime();
        int fullSecondsTime1 = time1.fullSeconds();
        System.out.println("Количество секунд всего: " + fullSecondsTime1);
        Time time2 = new Time(35300);
        time2.printTime();
        System.out.println(time1.equalsTime(time2));
    }
}
