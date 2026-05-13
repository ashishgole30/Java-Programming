sealed class A permits B, C {
    // sealed keyword
    // permits keyword the name of class which can extend sealed class
}

final class B extends A {
    // ONLY CLASS B AND CLASS C SHOULD BE ALLOWED
    // TO INHERIT CLASS A

    // class b and c should either be
    // sealed , non sealed or final
}

final class C extends A {

}

class D {

}

public class One {
    public static void main(String[] args) {

        // Abstract class -> meant to be inherited
        // Final class -> cannot be inherited

        // sealed class->A sealed class is a technique that limits the number of classes
        // that can inherit the given class

    }
}