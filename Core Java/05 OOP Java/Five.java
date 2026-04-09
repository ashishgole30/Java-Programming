class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);

    }
}

public class Five {
    public static void main(String[] args) {

        // STATIC KEYWORD

        Mobile obj1 = new Mobile();

        Mobile.name = "SmartPhone";

        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();

        obj2.brand = "Samsung";
        obj2.price = 1700;

        obj1.show();
        obj2.show();
    }
}