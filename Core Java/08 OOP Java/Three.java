class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        super(n);
        System.out.println("in B int");
    }

}

public class Three {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

// When you create object of a class
// It will call constructor of subclass and superclass both

// Every constructor in java has a method which is there
// even if u dont mention
// its "super();"
// super(); = call the constructor of a super class
// by defaul calls the default one

// Every class in java extends "object class"
// extends Object
// even if you dont mention its there