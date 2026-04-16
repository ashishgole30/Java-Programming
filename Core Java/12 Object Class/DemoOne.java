class Laptop {

    int price;
    String model;

    // But what if we create our implementation of the method
    // toString();
    // public String toString() {
    // return "hey";
    // }

    // public String toString() {
    // return model + ":" + price;
    // }
}

public class DemoOne {
    public static void main(String[] args) {

        // OBJECT CLASS
        // every class in java extends the object class
        Laptop obj = new Laptop();

        obj.model = "lenovo yoga";
        obj.price = 1000;

        System.out.println(obj);// This line is basically
        System.out.println(obj.toString());// this line actually

        // Everytime you try to print an object
        // by default behind the scenes it will call toString() method

        // If you dont have method in your class it will call the method of the super
        // class in this case the object class

    }
}