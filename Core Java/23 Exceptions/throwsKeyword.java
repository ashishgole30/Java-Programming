public class throwsKeyword {

    static {
        System.out.println("Class is loaded");
    }

    public static void main(String[] args) // throws ClassNotFoundException // this is not recommended
    // never do that with main
    // the problem is when you are throwing the exceptions for main
    // who is calling the main ?
    // the JVM
    // hey jvm you have to handle this exception
    // jvm will say hey if you throw it to me
    // i will simply stop the exceution
    // thus not a good idea
    {
        // THROWS KEYWORD

        // this is called
        // ducking the exceptions

        // it is NOT like plural of throw keyword
        // it is NOT like if you want to throw multiple exceptions then you can use
        // throws keyword

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}