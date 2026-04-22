enum Status {
    // Actually Status is a class
    // And it has 4 objects Running, Failed, Pending, Success
    Running, Failed, Pending, Success; // these are named constants
    // 0 ,1 ,2 ,3
}

public class Demo {
    public static void main(String[] args) {

        // ENUMS
        // (Enumeration)

        // named constants

        Status s1 = Status.Running;
        System.out.println(s1);

        // Status s2 = Status.NoIdea;
        // System.out.println(s2); // ERROR

        Status s2 = Status.Running;
        System.out.println(s2.ordinal());
        // Output: 0

        Status s3 = Status.Success;
        System.out.println(s3.ordinal());
        // Output: 3

        Status s4[] = Status.values();
        // gives an array of all the constants in the enum
        for (Status s : s4) {
            System.out.println(s + " : " + s.ordinal());
        }
    }
}