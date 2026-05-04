// Ashish Exception is a custom exception class that extends the built-in Exception class in Java. 
// It allows you to create your own exception type with a custom message but for it call the super class constructor.

// we can do this by creating our own exception class
// The things is you cannot simple create a class
// and call it an exception class
// you can build something or get from the parents

class AshishException extends Exception {
    // constructor to accept the message
    public AshishException(String string) {
        // calling the super class constructor
        super(string);
    }
}

public class throwKeywordTwo {
    // THROW KEYWORD
    // used to throw the exception
    // what if you want to throw your own exception
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new AshishException(" I dont want to print zero");// you are throwing an exception
        } catch (AshishException e) {
            // handling the error
            j = 18 / 1;
            System.out.println("The default output is " + e);
        } catch (Exception e) {
            System.out.println("Caught a general exception:" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}