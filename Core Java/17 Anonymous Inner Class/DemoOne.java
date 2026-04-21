class A {
    public void show() {
        System.out.println("in a show");
    }
}

// Instead of method overriding
public class DemoOne {
    public static void main(String[] args) {
        // Anonymous Inner Class
        // Anonymous: something which doesnt have a name

        // defining new implementation
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }
        };
        // so we are providing a new implementation here
        /*
         * This is called a inner class
         * we are not using a class keyword and also not giving it a name
         * it is inside DemoOne class and since it has no name
         * it is called Anonymous inner class
         */
        obj.show(); // when you call show it outputs the new implementation
    }
}