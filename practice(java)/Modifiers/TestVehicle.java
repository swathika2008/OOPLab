abstract class Vehicle {

    static String company = "Tata";

    final int year = 2024;

    abstract void start();

    static void showCompany() {
        System.out.println("Company: " + company);
    }

    final void showYear() {
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }
}

public class TestVehicle {
    public static void main(String[] args) {

        Car obj = new Car();

        obj.start();
        obj.showYear();
        Vehicle.showCompany();
    }
}