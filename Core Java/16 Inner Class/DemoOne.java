class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

}

public class DemoOne {
    public static void main(String[] args) {
        // INNER CLASS

        /* A class inside a class */

        A obj1 = new A();
        obj1.show();

        // B obj2 = new B(); // This will give error
        // Unable to find B
        // B is not openly Available
        // B is a part of A

        A.B obj2 = obj1.new B();
        obj2.config();
        // If you want to create an object of inner class
        // which is B in this case
        // First specify where it belongs to
        // then you need an object of outer class
        // to create object of inner class

        // A$B.class file: B belongs to A thats why A.B
        // Syntax-> A.B objectName = objectOfA.new B();
        // To create an object of B you need an object of A first
        // WHY ?
        // lets say you want to call show method
        // It is a NON STATIC METHOD
        // which means to call show you need object
        // In the same way if you want to access the variable "age"
        // you need object

        // In the same way
        // if you want to create an object of B
        // you need an object of A
        // because that is a NON STATIC CLASS

    }
}