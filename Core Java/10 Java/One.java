public class One {
    // ACCESS MODIFIERS
    public static void main(String[] args) {
        // Private
        // Public
        // Protected
        // Default

        // 1. Public // CAN BE USED ANYWHERE

        Hello obj = new Hello();
        System.out.println(obj.marks);
        obj.show();
        // no issue cause they are in same package
        // if you want to access something
        // which is outside of the package make it public
        // public means it can be accessed from anywhere

        // 2. Private // CAN BE USED WITHIN THE SAME CLASS

        // private variables can be used in the same class irrespective of the package
        // System.out.println(obj.number); // cannot be used since variable number is
        // private

        // 3. Default access modifier // CAN BE ACCESSED WITHIN THE SAME PAKCAGE

        // 4. Protected // CAN BE USED ON THE SAME CLASS , SAME PACKAGE , IN THE OTHER
        // PACKAGE BUT SUBCLASS

        // TRY TO MAKE YOUR CLASSES PUBLIC
        // Cannot have two public classes in same file
        // try to keep instance variables private
        // methods can be public , protected

    }
}

class hi extends Hello {
    Hello o = new Hello();

    public void abc() {
        System.out.println(o.num);
    }
}