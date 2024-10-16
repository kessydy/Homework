package by.it_academy.homework8.airline;

public class Main {
    //    Авиакомпания. Определить иерархию самолетов, вертолетов, квадрокоптеров и т.д.
//    Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
//    Найти самолет в компании, соответствующий заданному диапазону параметров.
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("AH-70", 3, 35000);
        Airplane airplane2 = new Airplane("Boeing 767", 350, 31000);
        Airplane airplane3 = new Airplane("Ту-154M", 180, 18000);
        Airship airship1 = new Airship("Au-30", 4, 1400);
        Helicopter helicopter1 = new Helicopter("Ми-171А2", 20, 4000);
        Helicopter helicopter2 = new Helicopter("Robinson R44", 2, 150);
        Quadcopter quadcopter1 = new Quadcopter("DJI AGRAS T20Э", 0, 0,
                true, 42.6);

        System.out.println(airship1);
        Aircraft[] aircrafts = {airplane1, airplane2, airplane3, airship1, helicopter1, helicopter2, quadcopter1};
        AirLine airLine = new AirLine(aircrafts);
        System.out.println(airLine);
        System.out.println("The full passenger capacity of aircrafs is: " + airLine.getFullPassengersCapacity());
        System.out.println("The full lifting capacity of aircrafs is: " + airLine.getFullLiftingCapacity());
        System.out.println();
        System.out.println("Passengers capacity from 200 to 400 & lifting capacity from 300 to 60000 includes: " +
                airLine.findPlanePassengersCapacityLiftingCapacity(200, 400,
                        300, 60000));
        System.out.println("Name \"Ми-171\" includes: " + airLine.findPlaneName("Ми-171"));
        System.out.println("Name \"Robinson R44\" includes: " + airLine.findPlaneName("Robinson R44"));
        System.out.println("Lifting capacity from 300 to 5000 includes: " +
                airLine.findPlaneLiftingCapacity(300, 5000));
        System.out.println("Passengers capacity from 200 to 10000 includes: " +
                airLine.findPlanePassengersCapacity(200, 10000));
    }
}

