class Laptop {
    int price;
    String model;

    // public boolean equals(Laptop that) {
    // if (this.model.equals(that.model) && this.price == that.price) {
    // return true;
    // } else {
    // return false;
    // }
    // }// After doing this output is - True
}

public class DemoTwo {
    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "lenovo yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "lenovo yoga";
        obj2.price = 1000;

        // Comparing the objects
        // The values are same

        boolean result = obj1.equals(obj2);
        System.out.println(result);
        // OUTPUT - False
        // .equals is an object class method actually
        // obj1.equals(obj2) compares their hexadecimal number

        // If we want to compare the objects by their values we can override the
        // .equals() method by ourself

    }
}