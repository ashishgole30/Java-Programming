@FunctionalInterface
interface A {
    void show(int i);
}

public class Two {
    public static void main(String[] args) {

        // A obj = new A() {
        // public void show(int i) {
        // System.out.println("in show " + i);
        // }
        // };
        // obj.show(5);

        // Using Lambda Expression
        A obj = i -> System.out.println("in show " + i);
        obj.show(5);
    }
}