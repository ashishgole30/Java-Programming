interface A {
    // public abstract void show();
    void show();

    // public abstract void config();
    void config();

    int age = 10;
    String area = "New York";
    // we got an error
    // every variable in interface is by default final and static
    // so we need to initialize it

    // it is final because interfaces dont have their own memory in the heap
}

// for abstract classes we use extends keyword but for interfaces we use
// implements keyword
// It becomes compulsory for the class to override all the methods of the
// interface
// if you fail to override all the methods of the interface then you have to
// make that class abstract
// (by default it becomes abstract)
class B implements A {

    // what you get in implements is the only the methods not the variables
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

}

public class DemoOne {
    public static void main(String[] args) {
        // INTERFACES

        // when you have a class which only has abstract methods
        // you can make an interface instead

        // Interface is not a class
        // by default all the methods in an interface are abstract and public

        // A obj;
        // obj = new A();
        // Gives error because we cannot create an object of an interface

        // Now you cant create object of interface A
        // but you can create object of class B which implements interface A
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        // Does not give error

        // Since they are static
        // we dont have to use the object to access them
        System.out.println(A.age);
        System.out.println(A.area);

        // if we try to change the value of age or area we will get an error because
        // they are final
        // A.age = 20; // gives error

    }
}