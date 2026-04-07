public class One {
    public static void main(String[] args) {

        // String in Java is NOT actually a primitive data type
        // Its actually a Class

        String name = "navin";
        // behind the scenes it is creating an object for you
        // its Actually:
        // String name = new String("navin");
        System.out.println("Hello " + name);
        System.out.println("---------------");
        System.out.println(name.charAt(1));
        System.out.println("---------------");
        System.out.println(name.concat(" reddy"));
        System.out.println("---------------");

        String namee = "navin";
        namee = namee + " reddy";
        System.out.println(namee);

        // You are not chaning the existing string
        // If you think you have a variable namee = navin
        // then you are changing it into navin reddy
        // thats not the case

        String s1 = "Navin";
        String s2 = "Navin";
        System.out.println(s1 == s2);
        // Behind the scenes you are not creating two objects
        // You got two references s1 s2
        // but in total you have only 1 object
        // The value for the addresses are the same
        // In heap memory you have a special area called String Constant Pool
        // Every String which u create is actually a constant, you cannot change it

        // Mutabble String = can change
        // Immutabble String = cannot change
        // By Default Strings are immutable in java
        // Once you create an object you cannot change itj

    }
}