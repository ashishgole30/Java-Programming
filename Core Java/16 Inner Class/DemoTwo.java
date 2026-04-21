class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    // making this class STATIC
    // When you refer a class as static class
    // You dont need object
    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class DemoTwo {
    public static void main(String[] args) {
        // INNER CLASS
        /* A class inside a class */

        A obj1 = new A();
        obj1.show();

        A.B obj2 = new A.B();
        // this work only when the inner class is static
        // outer class cannot be static
        // static can be only used for inner class
        obj2.config();
    }
}