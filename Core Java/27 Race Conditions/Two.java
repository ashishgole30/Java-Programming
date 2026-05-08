class Counter {
    int count;

    // How to make sure only one thread works with the increment method at one time
    // keyword-> synchronized
    public synchronized void increment() {
        count++;
    }
}

public class Two {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {

            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // allows main thread to wait for other threads to comeback and join
        t1.join();
        t2.join();

        System.out.println(c.count);

        // Threads can still be unpredictable
    }
}

// Main thread
// t1 thread--------t2 thread
// t1 calls 1000 times
// t2 calls 1000 times
// we expect count to be 2000
// main is just printing value of count