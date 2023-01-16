package homeworks.homework2_8.transport;

import homeworks.homework2_8.drivers.CategoryB;
import homeworks.homework2_8.drivers.CategoryC;
import homeworks.homework2_8.drivers.CategoryD;
import homeworks.homework2_8.drivers.Driver;
import homeworks.homework2_8.mechanics.Mechanics;
import homeworks.homework2_8.transport.Bus;
import homeworks.homework2_8.transport.Cars;
import homeworks.homework2_8.transport.Tracks;
import homeworks.homework2_8.transport.Transport;
import homeworks.homework2_8.transport.Cars.BodyType;
import homeworks.homework2_8.transport.Tracks.LoadCapacity;
import sun.util.locale.LocaleUtils;

import java.io.PrintStream;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void printTransport(Transport<?>... drivers) {
        Transport[] var1 = drivers;
        int var2 = drivers.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Transport<?> driver = var1[var3];
            PrintStream var10000 = System.out;
            Driver var10001 = driver.getDriver();
            var10000.println("Водитель " + var10001 + " управляет автомобилем " + driver.getBrand() + " " + driver.getModel() + " и будет участвовать в заезде!");
        }

    }
//    public static void searching (){
//        if () {
//            System.out.println(phoneBook.get("Dmitriy"));
//        } else {
//            System.out.println("Контакт не найден");
//        }
//    }

    public static void main(String[] args) {
        Bus bus1 = new Bus("Reno", "A5", 2.1, 1, "busType", "Василий");
        Bus bus2 = new Bus("Reno", "Logan", 3.7, 49, "busType", "Петр");
        Bus bus3 = new Bus("Reno", "F4", 4.5, 35, "", "Иван");
        Bus bus4 = new Bus("Reno", "A6", 7.2, 150, "busType", "Петр");
        Cars car1 = new Cars("Lada", "Granta", 3.4, BodyType.SUV, "carType", "Евгений");
        Cars car2 = new Cars("Lada", "Vesta1", 4.4, BodyType.VAN, "carType", "Петр");
        Cars car3 = new Cars("Lada", "X-Ray", 5.4, BodyType.MINIVAN, "carType", "Василий");
        Cars car4 = new Cars("Lada", "Vesta2", 6.4, BodyType.HATCHBACK, "carType", "Иван");
        Tracks track1 = new Tracks("Kia", "A1", 10.1, LoadCapacity.N1, "trackType", "Евгений");
        Tracks track2 = new Tracks("Kia", "A1", 11.1, LoadCapacity.N2, "trackType", "Василий");
        Tracks track3 = new Tracks("Kia", "A1", 12.1, LoadCapacity.N2, "trackType", "Евгений");
        Tracks track4 = new Tracks("Kia", "A1", 13.1, LoadCapacity.N3, "trackType", "Петр");
        CategoryB carDriver1 = new CategoryB(1, "Ivan Ivanovich", true);
        CategoryB carDriver2 = new CategoryB(2, "Ivan Petrovich", true);
        CategoryB carDriver3 = new CategoryB(3, "Ivan Kuzmichov", true);
        CategoryB carDriver4 = new CategoryB(4, "Ivan Sergeevich", true);
        CategoryC trackDriver1 = new CategoryC(5, "Kuzma Petrovich", true);
        CategoryC trackDriver2 = new CategoryC(6, "Kuzma Kuzmich", true);
        CategoryC trackDriver3 = new CategoryC(7, "Kuzma Gregorevich", true);
        CategoryC trackDriver4 = new CategoryC(8, "Kuzma Mihailovich", true);
        CategoryD busDriver1 = new CategoryD(9, "Sergey Ivanovich", true);
        CategoryD busDriver2 = new CategoryD(10, "Sergey Petrovich", true);
        CategoryD busDriver3 = new CategoryD(11, "Sergey Gregorevich", true);
        CategoryD busDriver4 = new CategoryD(12, "Sergey Mihailovich", true);
        Mechanics mechanics4 = new Mechanics("Василий", "Солнышко");
        Mechanics mechanics1 = new Mechanics("Петр","Телепузики");
        Mechanics mechanics2 = new Mechanics("Евгений","Автодор");
        Mechanics mechanics3 = new Mechanics("Иван","Дорожные фиксики");
        car1.setDriver(carDriver1);
        car2.setDriver(carDriver2);
        car3.setDriver(carDriver3);
        car4.setDriver(carDriver4);
        bus1.setDriver(busDriver1);
        bus2.setDriver(busDriver2);
        bus3.setDriver(busDriver3);
        bus4.setDriver(busDriver4);
        track1.setDriver(trackDriver1);
        track2.setDriver(trackDriver2);
        track3.setDriver(trackDriver3);
        track4.setDriver(trackDriver4);
        printTransport(car1, car2, car3, car4, track1, track2, track3, track4, bus1, bus2, bus3, bus4);
        car1.pitStopTime();
        car1.roundTime();
        car1.maxVelocity();
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
        car4.printInfo();
        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();
        bus4.printInfo();
        track1.printInfo();
        track2.printInfo();
        track3.printInfo();
        track4.printInfo();
        BodyType.values();
        System.out.println(Arrays.toString(BodyType.values()));
        System.out.println(Arrays.toString(LoadCapacity.values()));
        track1.printInfo();
        track1.printLoadCapacity();
        bus1.printBusCapacity();
        bus1.printType();
        bus3.printType();
        car1.printType();
        track1.printType();
        car1.getCheckedOutDiagnostic();
        track1.getCheckedOutDiagnostic();
        carDriver2.getDrivingLicence();

        List<Mechanics> mechanicsList = new ArrayList<>();
        mechanicsList.add(mechanics1);
        mechanicsList.add(mechanics2);
        mechanicsList.add(mechanics3);
        mechanicsList.add(mechanics4);
        List<Transport> transportsList = new ArrayList<>();
        transportsList.add(car1);
        transportsList.add(bus3);
        transportsList.add(track2);
        transportsList.add(bus2);
        List<Driver> driversList = new ArrayList<>();
        driversList.add(carDriver1);
        driversList.add(busDriver2);
        driversList.add(carDriver3);
        driversList.add(trackDriver2);
        //mechanicsList.forEach((mechanics)-> System.out.println(mechanics));
        transportsList.forEach((Cars)-> System.out.println(Cars));
        driversList.forEach((Driver)-> System.out.println(Driver));
        Map<Transport,Mechanics> mixDrivers = new HashMap<>();
        mixDrivers.put(car4,mechanics4);
        mixDrivers.put(car1,mechanics2);
        mixDrivers.put(bus4,mechanics1);
        mixDrivers.put(track4,mechanics3);
        for(Map.Entry<Transport, Mechanics> mixDriversEntry:mixDrivers.entrySet()) {
            System.out.println("Ключ " + mixDriversEntry.getKey().getBrand() + " : " + mixDrivers);
        }
        Set<Driver> set = new HashSet<>(driversList);
        Iterator<Driver> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(set.iterator().next().getFullName());
        }
//        void deQueue(){
//            int back = -1;
//            int front = -1;
//            if(car4.isEmpty()){
//                System.out.println("Queue is empty. Nothing to dequeue");
//            } else if (front == back){
//                front = back = -1;
//            } else {
//                front++;
//            }
        printAuto(car1);
        }
        public static void printAuto(Transport transport) {
            System.out.println("Машину ведет " + transport.getDriver() + " водитель и у нее: механик - " + transport.getMechanic());
    }
}
