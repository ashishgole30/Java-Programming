public class throwKeywordOne {

    // THROW KEYWORD
    // used to throw the exception
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException(" I dont want to print zero");// you are throwing an exception
        } catch (ArithmeticException e) {
            // handling the error
            j = 18 / 1;
            System.out.println("The default output is" + e);
        } catch (Exception e) {
            System.out.println("Caught a general exception:" + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}