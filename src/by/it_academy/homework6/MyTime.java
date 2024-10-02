package by.it_academy.homework6;

public class MyTime {
    public static void main(String[] args) {
        Time time1 = new Time(31, 5, 8);
        Time fulltime1 = time1.fullSeconds();
        fulltime1.printTime();
        Time time2 = new Time(45, 53, 24);
        Time fulltime2 = time2.fullSeconds();
        fulltime2.printTime();
        time1.compareTime(time2);
    }
}
