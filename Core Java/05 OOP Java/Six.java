class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj1) {
        System.out.println("in static method");
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
    }
}

public class Six {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();

        Mobile.name = "SmartPhone";

        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();

        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}