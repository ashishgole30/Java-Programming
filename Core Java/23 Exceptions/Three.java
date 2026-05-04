public class Three {
    public static void main(String[] args) {

        // Statements can be
        // Normal statements
        // Critical statements

        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        try {

            // try block goes in line wise sequence
            // This block of code means
            // Hey java try to execute this code
            // If it runs fine ,
            // If it doesnt , move to the next part
            j = 18 / i;
            System.out.println(str.length());
            // the moment you get an exception here , it jumps out of the try block
            // so we did not reach to check if theres an exception in the next lines in try
            // block
            System.out.println(nums[1]);

            System.out.println(nums[5]); // This will cause array out of bounds exception
        }
        // Put only critical statements in the try block
        // You can write multiple statements try catch blocks
        // catch the error
        // It is throwing you an object
        // so accept it as a object
        // so we refer that with an Exception class
        catch (ArithmeticException e) {
            // based on the type of e object
            // we should print a different message
            // using if() statements
            // OR
            // we can be specific and write ArithemticException instead of Exception in the
            // catch block
            System.out.println("Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }

        // To be on the safer side , you can also write a catch block for the parent
        // class of all exceptions
        // which is Exception class
        catch (Exception e) {
            // Exception is the parent class of all exceptions
            System.out.println("Some exception occurred" + e);
        }

        // make sure your parent is at the bottom
        // Actually Exceptions also extends Throwable class
        // throwable class is like the topmost class

        // Even if you have a try block
        // but you dont have a catch block
        // You are not actually handling it

        // Catch block will be only executed in case of an exception
        // otherwise it will be skipped

        // At this point the execution will stop
        System.out.println(j);
        // we never reach this line of code
        System.out.println("Bye");
    }
}