/**
Here are some key reasons why do we use inheritance:
      1->Code Reusability
      2->Hierarchical Classification: you can have a base class like Animal and derived classes like Dog, Cat, and Bird, which represent specific types of animals.
      3->Polymorphism:a method defined in a parent class can be overridden in a child class, enabling dynamic method resolution at runtime.
      4->Reduced Complexity:

 */
class Vehicle {
    String fuelType;
    int noOfWheels;
    int speed;

    void start() {
        System.out.println("Vehicle is starting.. ");
    }

    void stop() {
        System.out.println("Vehicle has stoped..");
    }
}

class Car extends Vehicle {
    int noOfDoors;
    boolean airConditioning;

    void openAirConditioning() {
        System.out.println("AirConditioning is on..");
    }

    void showCarDetails() {
        System.out.println("\n\n\t************carDetails***********");
        System.out.println("fuelType : " + fuelType);
        System.out.println("noOfWheels : " + noOfWheels);
        System.out.println("speed : " + speed);
        System.out.println("noOfDoors : " + noOfDoors);
        System.out.println("airConditioning : " + airConditioning);

    }
}

class Bike extends Vehicle {
    boolean hasHandleBar;

    void rideBike() {
        System.out.println("Riding the Bike..");
    }

    void showBikeDetails() {
        System.out.println("\t************bikeDetails***********");
        System.out.println("fuelType : " + fuelType);
        System.out.println("noOfWheels : " + noOfWheels);
        System.out.println("speed : " + speed);
        System.out.println("hasHandleBar: " + hasHandleBar);
    }
}

public class LearnInheritance {

    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.fuelType = "Petrol";
        myCar.speed = 100;
        myCar.noOfWheels = 4;
        myCar.airConditioning = true;
        myCar.noOfDoors = 4;

        myCar.showCarDetails();
        myCar.start();
        if (myCar.airConditioning) {
            myCar.openAirConditioning();
        }
        System.out.println("\n\n");

        Bike myBike = new Bike();
        myBike.speed = 200;
        myBike.fuelType = "Diesel";
        myBike.noOfWheels = 2;
        myBike.hasHandleBar = true;
        myBike.showBikeDetails();
        if (myBike.hasHandleBar) {
            myBike.rideBike();
        }
    }
}