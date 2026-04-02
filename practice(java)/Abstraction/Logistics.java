abstract class Vehicle {
    void startEngine() {
        System.out.println("Engine started...");
    }
    abstract void calculateFuelEfficiency();
}

class Truck extends Vehicle {
    void calculateFuelEfficiency() {
        System.out.println("Truck Efficiency: 5 km/liter (Heavy Load)");
    }
}

class ElectricCar extends Vehicle {
    void calculateFuelEfficiency() {
        System.out.println("Electric Car Efficiency: 150 km/charge");
    }
}

public class Logistics {
    public static void main(String[] args) {
        Vehicle myTruck = new Truck();
        myTruck.startEngine();
        myTruck.calculateFuelEfficiency();

        Vehicle myEV = new ElectricCar();
        myEV.calculateFuelEfficiency();
        
      
    }
}
