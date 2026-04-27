@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class Three {
    public static void main(String[] args) {

        // A obj = new A() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };
        // int result = obj.add(5, 4);
        // System.out.println("Result: " + result);

        // Using lambda expression
        A obj = (i, j) -> i + j;
        int result = obj.add(5, 4);
        System.out.println("Result: " + result);
    }
}