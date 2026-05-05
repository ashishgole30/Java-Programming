// class A implements Runnable {
// public void run() {
// for (int i = 1; i <= 5; i++) {
// System.out.println("hi");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// }
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (int i = 1; i <= 5; i++) {
// System.out.println("hello");
// try {
// Thread.sleep(10);
// } catch (InterruptedException e) {
// }
// }
// }
// }

public class Five {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            // Anonymous class
            // we have to implement the method
            // which is in runnable
            // ie (same method which was in A)

            // converting to lambda expression
            // lambda expression works on functional interface
            // runnable is actually an functional interface
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}