class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In B show");
    }
}

public class DemoThree {
    public static void main(String[] args) {

        // Down Casting
        A obj = new B();
        obj.show1();

        // The object is of B
        // and the method show2 also belongs to B
        // but we cannot still call it why?
        // Cause the reference is A
        // A has no idea what is show2()
        // obj.show2();

        B obj1 = (B) obj;
        // hey i know the reference (obj) is of A
        // but the object is of B right
        // so i want the type to be of B
        // so obj is parent reference
        // you are down casting it to child reference
        // now we can call show2
        obj1.show2();
    }
}