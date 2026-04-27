@FunctionalInterface
interface A {
    void show(); // 1 Method
}

// class B implements A {

// public void show() {
// System.out.println("in show");
// }
// }

public class One {
    public static void main(String[] args) {

        // Functional Interface
        // Interface which has only one method

        // NOTE - we cannot instantiate an interface
        // Java is no more verbose
        // Verbose -> more lines of code to do a simple task
        // Java 8 Feature -> Lambda Expression
        // We can only use lambda expression with functional interface

        // A obj = new A() {
        // public void show() {
        // System.out.println("in show");
        // }
        // };
        // obj.show();

        A obj = () -> System.out.println("in show"); // Lambda Expression
        obj.show();
    }
}