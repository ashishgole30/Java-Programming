// Multiple ways to create threads

// we can extend thread class
// or implement runnable interface (not have thread methods , needs to create separate thread objects)

class Z {

}

// we want A to be a thread as well as child of class Z
// but in java as you know multiple inheritance in java is not possible
// class A extends Z,Thread
// {
// public void run() {
// for (int i = 1; i <= 100; i++) {
// System.out.println("hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// }
// }
// }
// }

// Thread class implements runnable
// runnable has run() method
// which means we can implement runnable too
// as it has run method

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Four {
    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();

        Runnable obj1 = new A();
        Runnable obj2 = new B();
        // Reference of an interface
        // and object of a class

        // Creating two different threads
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // now we are passing runnable object in the thread constructor

        t1.start();
        t2.start();
        // now it works as threads have start methods
        // but now no output cause
        // these two threads have no idea
        // what is class A , class B

        // obj1.start();
        // obj2.start();

        // they start() will not work
        // cause in runnable interface
        // we do not have a start() method
    }
}