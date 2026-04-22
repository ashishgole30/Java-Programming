// ENUMS WITH SWITCH CASE
enum Status {
    Running, Failed, Pending, Success;
}

public class DemoThree {
    public static void main(String[] args) {

        // Switch case with enums
        Status s = Status.Pending;

        switch (s) {

            case Running:
                System.out.println("Task is running");
                break;

            case Failed:
                System.out.println("Task has failed");
                break;

            case Pending:
                System.out.println("Task is pending");
                break;

            case Success:
                System.out.println("Task has succeeded");
                break;

            default:
                System.out.println("Unknown status");
                break;
        }
    }
}