class A extends Thread {
    // now this class is not an ordinary class
    // it is a thread class
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    // now this class is not an ordinary class
    // it is a thread class
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

public class Two {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        // call method start
        obj1.start();
        obj2.start();

        // start is a method belonging to thread class
        // but it calls a run method

        // in OS we have a concept of scheduler
        // scheduler says if you want to execute somehting
        // you have to come to me first

        // 4 cores -> 4 threads at the same time
        // 8 cores cpu -> 8 threads at same time

        // Schedulers job is to allow which thread to execute on the os
    }
}

// Main method
// main wants to now execute
// 2 show methods
// show() of A
// show() of B
// we want two separate threads