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

public class DemoTwo {
    public static void main(String[] args) {

        // UpCasting
        // Reference of A and object of B
        // childclass object but type caste it to parent class
        // so we go up
        // A is super class , B is subclass
        A obj = (A) new B();
        obj.show1();
    }
}