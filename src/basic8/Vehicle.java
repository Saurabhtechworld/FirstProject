package basic8;

public class Vehicle {

    final int gears = 4;

    int wheelsCount;

    String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("Vehicle is starting");
    }

    final void accelerate(){
        System.out.println("Vehicle is accelerateing");
    }
}
