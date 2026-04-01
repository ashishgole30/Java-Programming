public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("-----------------------------");

        int num1 = 2;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println(result);

        System.out.println("-----------------------------");

        int num3 = 1232;
        byte num4 = 127;
        short num5 = 558;
        long num6 = 242l;
        float f = 5.8f;
        double d = 5.8;
        char c = 'k';
        boolean b = true;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

        System.out.println("-----------------------------");

        int num7 = 100_000_000;
        System.out.println(num7);
        char character = 'a';
        character++;
        System.out.println(character);

        System.out.println("-----------------------------");

        // Type conversion and type casting
        // if its happening automatic its conversion
        // if you are dong it explicitly its casting

        // casting
        byte number = 127;
        int intnumber = 12;
        number = (byte) intnumber;
        System.out.println(number);

        // if the range is outside the range of the data type it will perform modulo
        // operation
        int numberrr = 257;
        byte bytenumber = (byte) numberrr;
        System.out.println(bytenumber);
        // output will be 1 because 257 % 256 = 1
        // since range of byte is -128 to 127, it will perform modulo operation with 256
        // (number of values in byte) to fit the value into the byte range

        // casting
        float floatnumber = 5.6f;
        int numm = (int) floatnumber;
        System.out.println(numm);

        // type promotion
        byte num8 = 10;
        byte num9 = 30;
        int resulttt = num8 * num9; // byte * byte is promoted to int
        System.out.println(resulttt);

    }
}