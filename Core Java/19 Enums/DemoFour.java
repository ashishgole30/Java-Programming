enum Status {
    Running, Failed, Pending, Success;
}

public class DemoFour {
    public static void main(String[] args) {
        // You cant extend enum within another class
        // You can define methods , constructors, variables

        Status s = Status.Running;
        // by default in java
        // enum in java extends a enum class
        System.out.println(s.getClass().getSuperclass());

    }
}