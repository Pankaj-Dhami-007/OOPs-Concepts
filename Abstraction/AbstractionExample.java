abstract class Device {
    public abstract void mechanism();

    void fxn() {
        System.out.println("hiii");
    }
}

// incomplete class
abstract class ElectronicDevice extends Device {
    public double eConsumption;

    public abstract void on();

    public abstract void off();
}

class Fan extends ElectronicDevice {
    @Override
    public void on() {
        System.out.println("directly on by button");
    }

    @Override
    public void off() {
        System.out.println("directly off by button");

    }

    @Override
    public void mechanism() {
        System.out.println("barring and wires");
    }
}

class TV extends ElectronicDevice {
    @Override
    public void on() {
        System.out.println("first on the button then press the power button.");

    }

    @Override
    public void off() {
        System.out.println("first press the off button then off the button.");
    }

    @Override
    public void mechanism() {
        System.out.println("ic and controllers");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        // Information hiding : Encapsulation and Abstraction
        // 1. using abstract classes (0-100%)
        // 2. using interfaces (100%)

        // designing the complex problems

        // ElectronicDevice e=new ElectronicDevice();
        Fan f = new Fan();
        f.on();
        f.off();
        f.mechanism();

        // TV tv=new TV();
        // tv.on();
        // tv.off();

        // ElectronicDevice e2=new ElectronicDevice() {
        // @Override
        // public void on() {
        // System.out.println("on");
        // }
        // @Override
        // public void off() {
        // System.out.println("off");
        // }
        // @Override
        // public void mechanism() {
        // System.out.println("");
        // }
        // };

        // e2.on();
        // e2.off();
    }
}