public class One {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        try {
            // Normally with put critical statements here
            // if there is a critical statement throwing an exception
            // what you need is a catch block
            // is it compulsory to have a try with a catch ?
            // no theres no compulsion
            // but if you have a try block and dont have a catch block
            // it gives you an error
            // to solve this we use the keyword "finally"

            j = 18 / i;
            // System.out.println("bye");
            // this statement doesnt get printed as exception
            // is deteced and it jumps to
            // catch block
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("bye");
            // irrrespectve you get an exception or not
            // finally block gets executed
        }
    }
}