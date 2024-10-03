package by.it_academy.homework6.Time;

public class Objects {
    public static void main(String[] args) {
        Time time1 = new Time(31, 5, 8);
        time1.printTime();
        Time fulltime1 = time1.fullSeconds();
        fulltime1.printTime();
        Time time2 = new Time(35300);
        time2.printTime();
        time1.compareTime(time2);
    }
}
