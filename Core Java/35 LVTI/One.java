import java.util.ArrayList;

public class One {

    // var num = 10; // var is not allowed here

    public static void main(String[] args) {
        // LVTI
        // Local variable type inference

        // using local variables without declaring the data type
        // we can use var keyword
        // Reading code is more important than writing code
        // applicable only for local variables
        // not applicable for instance variables
        // local variable->Inside a method, constructor, or block.
        // instance variable->Inside a class, but outside any method or block.

        var obj = new ArrayList();

        int a = 9;
        var b = 8; // this is also integer data type

        int c;
        // var d; // error , we need to compulsory assign the value

        String var = "navin"; // no error , you can use "var"

        int nums[] = new int[10];
        var numss = new int[10];

        var object = new Alien();

    }
}

// class var { // this will give error , class name var is not allowed
// }
class Alien {
}