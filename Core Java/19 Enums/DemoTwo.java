// ENUMS WITH IF ELSE

enum Status {
    Running, Failed, Pending, Success;
}

public class DemoTwo {
    public static void main(String[] args) {

        // IF ELSE

        Status s = Status.Pending;
        if (s == Status.Running) {
            System.out.println("Task is running");
        } else if (s == Status.Failed) {
            System.out.println("Task has failed");
        } else if (s == Status.Pending) {
            System.out.println("Task is pending");
        } else {
            System.out.println("Task has succeeded");
        }

    }
}