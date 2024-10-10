class Mammal {
    String name;
    int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showMammalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void makeSound() {
        System.out.println(name + " make a sound ");
    }
}

class Dog extends Mammal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks..");
    }

    void showDogInfo() {
        System.out.println("\n\t**********Dog Info***********");
        showMammalDetails();
        System.out.println("Breed: " + breed);

    }
}

class Cat extends Mammal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println(name + "Meows");
    }

    void showCatInfo() {
        System.out.println("\n\t*********Cat Information***********");
        showMammalDetails();
        System.out.println("Color: "+color);
    }

}

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Oggi", 7, "bulldog");
        //System.out.println(myDog.name);
         myDog.showDogInfo();
         
         Cat myCat = new Cat("baby", 2, "Black");
         myCat.showCatInfo();

    }
}
