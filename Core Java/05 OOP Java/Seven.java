class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static {
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Seven {
    public static void main(String[] args) // throws //ClassNotFoundException
    {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();

        // to load a class
        // Class.forName("Mobile");
    }
}