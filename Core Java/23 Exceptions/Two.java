public class Two {
    public static void main(String[] args) {

        // Statements can be
        // Normal statements
        // Critical statements

        int i = 0;
        int j = 0;
        try {
            // This block of code means
            // Hey java try to execute this code
            // If it runs fine ,
            // If it doesnt , move to the next part
            j = 18 / i;
        }
        // Put only critical statements in the try block
        // You can write multiple statements try catch blocks
        // catch the error
        // It is throwing you an object
        // so accept it as a object
        // so we refer that with an Exception class
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        // Catch block will be only executed in case of an exception
        // otherwise it will be skipped

        // At this point the execution will stop
        System.out.println(j);
        // we never reach this line of code
        System.out.println("Bye");
    }
}