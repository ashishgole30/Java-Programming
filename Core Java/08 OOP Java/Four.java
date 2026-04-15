class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }

}

public class Four {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

// this(); will execute the constructor of the same class
// super(); method will execute the construcor of the super class