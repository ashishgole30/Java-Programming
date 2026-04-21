// class -class -> extends
// class -interface -> implements
// interface -interface -> extends

interface A {
    // public abstract void show();
    void show();

    // public abstract void config();
    void config();

}

// NOW THE QUESTION ARRISES CAN A CLASS IMPLEMENT MORE THAN ONE INTERFACE
// YES IT CAN
// SO WE CAN HAVE ONE CLASS IMPLEMENTING MULTIPLE INTERFACES
// THATS NOT THE CASE WITH ABSTRACT CLASS
// BECAUSE ABSRACT CLASS CAN ONLY EXTEND ONE CLASS
// IN INTERFACES , YOU CAN HAVE A CLASS IMPLEMENTING MULTIPLE INTERFACES
interface X {
    void run();
}

// we can also have an interface extending another interface
interface Y extends X {
    // Y interface has a method run
}

class B implements A, X {

    // what you get in implements is the only the methods not the variables
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("running");
    }
}

public class DemoTwo {
    public static void main(String[] args) {
        // INTERFACES

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // obj.run();
        // gives error
        // A has no idea what run method is

        // to call run
        // we create reference of type X
        X obj2;
        obj2 = new B();
        obj2.run();

    }
}