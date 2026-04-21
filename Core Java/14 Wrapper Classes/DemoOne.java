public class DemoOne {
    public static void main(String[] args) {

        // WRAPPER CLASSES

        /*
         * Java provides primitive data types
         * that makes java 99.99% object oriented programming language
         * thats right java is not purely object oriented programming language because
         * of the presence of primitive data types
         * every class in java extends the object class
         * but not the primitive values
         * it works with a fixed size value
         */

        /*
         * collection framework is similar to value
         * which can have multiple values
         * but in collection you need to have object type
         */

        /* for every primitibe type we have a class for it */
        /* int -> Integer */
        /* char -> Character */
        /* boolean -> Boolean */
        /* float -> Float */
        /* double -> Double */
        /* byte -> Byte */
        /* short -> Short */
        /* long -> Long */
        /* these are wrapper classes which extend the object class */

        System.out.println("------------------------------");
        int num = 7;
        Integer num1 = 8; // directly assining primitive value to wrapper class variable
        System.out.println(num1);
        System.out.println("------------------------------");
        Integer num2 = new Integer(num);
        System.out.println(num2);
        System.out.println("------------------------------");
        // Boxing
        /*
         * You are taking a primitive value and wrapping it inside an object of its
         * corresponding wrapper class
         */

        Integer num3 = num;
        System.out.println(num3);// auto boxing
        System.out.println("------------------------------");
        /*
         * to get the integer value
         * unboxing:You are getting an object type from the primitive type
         */
        Integer num4 = 5;
        int num5 = num4.intValue();
        System.out.println(num5);
        System.out.println("------------------------------");
        /*
         * Doing the same but automatically
         * is called auto unboxing
         */
        int num6 = num4; // auto unboxing
        System.out.println(num6);
        System.out.println("------------------------------");
        /* autoboxing: when you store a primitive type in the object automatically */
        // auto unboxing: when you retrieve a primitive type from the object
        // automatically

        /* We have a String which stores a number 12 but it is in string format */
        /*
         * lets say we have to double the value
         * but str*2 does not work as you cannot perform operations on String
         * so we take the value from the string and convert it into integer using
         * parseInt method of class Integer
         */
        String str = "12";
        int value = Integer.parseInt(str);
        System.out.println(value * 2);
        System.out.println("------------------------------");

    }
}