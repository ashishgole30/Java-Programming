public class ProgramFour {
    public static void main(String[] args) {

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result1 = x > y && a > b;
        System.out.println(result1);
        // false
        boolean result2 = x > y && a < b;
        System.out.println(result2);
        // true
        boolean result3 = x < y || a < b;
        System.out.println(result3);
        // true
        boolean result4 = x < y && a > b;
        System.out.println(result4);
        // false
        boolean result5 = a > b;
        System.out.println(!result5);
        // true

    }
}
