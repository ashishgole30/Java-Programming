abstract class Car {

    // abstract method can belong to only abtract class

    // It is not compulsory that abstract class needs to have abstract methods
    // It can have abstract methods , normal methods and both normal methods and
    // abstract methods
    // you can create multiple abstract methods
    public abstract void drive(); // Declaring a method // NOT defining a method

    public void playMusic() {
        System.out.println("play music");
    }
}

class WagonR extends Car // Concrete class
{
    // I want wagonR to implement the drive feature

    // So if you are extending an abstract class
    // you need to override that abstract method
    public void drive() {
        System.out.println("Driving...");
    }
}

public class Demo {
    public static void main(String[] args) {

        // YOU CANT CREATE OBJECT OF AN ABSTRACT CLASS
        // YOU CAN CREATE AN OBJECT OF AN CONCRETE CLASS NOT AN ABTRACT CLASS
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}