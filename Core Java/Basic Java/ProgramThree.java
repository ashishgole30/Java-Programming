public class ProgramThree {
    public static void main(String[] args) {

        // = is assignment operatoe
        // == to compare two values
        // != not equal
        // < ,> greater than , less than
        // <= , =>l

        // output received is boolean

        int a = 1;
        int b = 2;

        b = a;
        System.out.println(b);

        System.out.println("------------");

        int c = 4;
        int d = 19;
        boolean result1 = c < d;
        System.out.println(result1);
        boolean result2 = c > d;
        System.out.println(result2);
        boolean result3 = c == d;
        System.out.println(result3);
        boolean result4 = c != d;
        System.out.println(result4);
        boolean result5 = c <= d;
        System.out.println(result5);
        boolean result6 = c >= d;
        System.out.println(result6);

    }
}