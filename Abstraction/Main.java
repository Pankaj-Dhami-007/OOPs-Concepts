
abstract class Vehicle {
    protected int power;
    protected String color;

    public Vehicle(int power, String color) {
        this.power = power;
        this.color = color;
    }

    public abstract void steer();
}

class Airplane extends Vehicle {

    public Airplane(int power, String color) {
        super(power, color);
    }

    @Override
    public void steer() {
        System.out.println("The airplane steers by adjusting flaps and ailerons.");
    }

    public void fly() {
        System.out.println("The airplane is flying in the sky.");
    }
}

abstract class Ship extends Vehicle {

    public Ship(int power, String color) {
        super(power, color);
    }

    @Override
    public void steer() {
        System.out.println("The ship steers by moving the rudder.");
    }

    public abstract void sail();
}

class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(int power, String color, int cargoCapacity) {
        super(power, color);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void sail() {
        System.out.println("The cargo ship is sailing with " + cargoCapacity + " tons of cargo.");
    }
}

class PassengerShip extends Ship {
    private int noOfPassengers;

    public PassengerShip(int power, String color, int noOfPassengers) {
        super(power, color);
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public void sail() {
        System.out.println("The passenger ship is sailing with " + noOfPassengers + " passengers.");
    }
}

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(5000, "White");
        airplane.steer();
        airplane.fly();

        CargoShip cargoShip = new CargoShip(3000, "Blue", 1000);
        cargoShip.steer();
        cargoShip.sail();

        PassengerShip passengerShip = new PassengerShip(4000, "Red", 500);
        passengerShip.steer();
        passengerShip.sail();
    }
}
