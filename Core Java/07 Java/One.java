class A {

    public A() {
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println("in show method");
    }
}

public class One {
    public static void main(String[] args) {

        // 1.
        // obj is called "refence variable"
        // since it is referring to an object
        A obj1 = new A();
        obj1.show();
        // referenced object
        // because there is reference in the stack
        // ----------------------------

        // 2.
        int marks; // declaring
        marks = 99; // assigning
        // Similary
        A obj2; // Reference Creation
        obj2 = new A(); // Creating an object and assigning to obj2

        // 3.
        new A(); // This is object creation
        // the moment we do this
        // in our heap memory an object is created
        // called "anonymous objects"
        // there is no reference
        // problem - cannot reuse them

        // 4.
        new A().show();

    }
}