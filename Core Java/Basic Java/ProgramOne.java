public class ProgramOne {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 / num2; // gives quotient
        int result4 = num1 % num2; // gives remainder
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("------------------------");

        int num3 = 10;
        // num3 = num3 + 7;
        num3 += 7;
        System.out.println(num3);
        int num4 = 10;
        num4++;
        System.out.println(num4);
        int num5 = 9;
        num5--;
        System.out.println(num5);

        int num6 = 10;
        ++num6;
        System.out.println(num6);
        int num7 = 10;
        --num7;
        System.out.println(num7);
        // ++num is pre increment
        // num++ is post increment
        System.out.println("-------------------");
    }
}