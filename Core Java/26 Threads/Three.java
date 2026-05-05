// you cannot control your scheduler
// you can only suggest your scheduler to give priority
// Threads Priority Concept

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
            // lets tell our thread to sleep

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // sleep method is checked exception
            // so we need to handle it
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

// now its possible
// two threads can go back to the scheduler at the same time
// so we can optimize it
// but not control it

public class Three {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // range 1-10
        // 1 least priority
        // 10 maximum priority
        // by default 5 priority

        // obj2.setPriority(1);
        // obj2.setPriority(10);

        // obj2.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(Thread.MIN_PRIORITY);
        // obj2.setPriority(Thread.NORM_PRIORITY);

        // you are just suggesting the scheduler

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj2.start();
    }
}

// we can set priority to threads
// we are only suggesting scheduler
// thread.sleep goes to a waiting stage