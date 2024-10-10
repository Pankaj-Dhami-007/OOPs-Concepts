// Abstract parent class
abstract class Vehicle {
    protected int power;  // Power in horsepower
    protected String color;  // Color of the vehicle

    // Constructor to initialize common attributes
    public Vehicle(int power, String color) {
        this.power = power;
        this.color = color;
    }

    // Abstract method: all vehicles steer, but how they do it can vary
    public abstract void steer();
}

// Child class of Vehicle
class Airplane extends Vehicle {

    // Constructor
    public Airplane(int power, String color) {
        super(power, color);
    }

    // Implementing the abstract steer method
    @Override
    public void steer() {
        System.out.println("The airplane steers by adjusting flaps and ailerons.");
    }

    // Additional behavior
    public void fly() {
        System.out.println("The airplane is flying in the sky.");
    }
}

// Child class of Vehicle
abstract class Ship extends Vehicle {

    // Constructor
    public Ship(int power, String color) {
        super(power, color);
    }

    // Implementing the abstract steer method
    @Override
    public void steer() {
        System.out.println("The ship steers by moving the rudder.");
    }

    // Additional behavior common to all ships
    public abstract void sail();
}

// Child class of Ship
class CargoShip extends Ship {
    private int cargoCapacity;  // Cargo capacity in tons

    // Constructor
    public CargoShip(int power, String color, int cargoCapacity) {
        super(power, color);
        this.cargoCapacity = cargoCapacity;
    }

    // Implementing sail behavior
    @Override
    public void sail() {
        System.out.println("The cargo ship is sailing with " + cargoCapacity + " tons of cargo.");
    }
}

// Child class of Ship
class PassengerShip extends Ship {
    private int noOfPassengers;  // Number of passengers

    // Constructor
    public PassengerShip(int power, String color, int noOfPassengers) {
        super(power, color);
        this.noOfPassengers = noOfPassengers;
    }

    // Implementing sail behavior
    @Override
    public void sail() {
        System.out.println("The passenger ship is sailing with " + noOfPassengers + " passengers.");
    }
}

// Main class to test the hierarchy
public class Index {
    public static void main(String[] args) {
        // Creating an airplane object
        Airplane airplane = new Airplane(5000, "White");
        airplane.steer();
        airplane.fly();

        // Creating a cargo ship object
        CargoShip cargoShip = new CargoShip(3000, "Blue", 1000);
        cargoShip.steer();
        cargoShip.sail();

        // Creating a passenger ship object
        PassengerShip passengerShip = new PassengerShip(4000, "Red", 500);
        passengerShip.steer();
        passengerShip.sail();
    }
}


/*
 Key Points:
Abstraction: The Vehicle class provides a general structure for all vehicles, with an abstract method steer() that is implemented differently in the child classes.
Airplane: Inherits from Vehicle and adds the fly() method.
Ship: Inherits from Vehicle, has a common steer() method, and defines an abstract sail() method.
CargoShip and PassengerShip: Inherit from Ship and implement the sail() method with their specific details.
This way, we ensure that each class focuses only on its own unique behavior while inheriting common features from the parent class.
 */
