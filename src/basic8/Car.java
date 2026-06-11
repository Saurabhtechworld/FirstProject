package basic8;

public class Car extends Vehicle {

    String color;

    void start(){
        System.out.println(this);
        System.out.println(this.model + "Car is starting");
    }
    Car(){
        super(2);
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
//        obj.wheelsCount = 4;
//        obj.model = "101";
//        obj.color = "red";
//        obj.start();
//        System.out.println(obj.wheelsCount);
    }
}
