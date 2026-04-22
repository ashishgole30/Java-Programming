enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    // WE ARE USING PRIVATE CONTRUCTORS NOT DEFAULT OR PUBLIC
    // REASON:WE ARE CREATING OBJECTS IN THE SAME CLASS ITSELF

    // Default constructor
    private Laptop() {
        price = 500;
    }

    // Parametirized Constructor
    private Laptop(int price) {
        this.price = price;
    }

    // methods
    // getters and setters

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class DemoFive {
    public static void main(String[] args) {

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        System.out.println("----------------------");
        lap.setPrice(1000000);

        for (Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }

    }
}