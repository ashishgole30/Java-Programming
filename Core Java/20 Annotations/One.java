class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In A show");
    }
}

class B extends A {

    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In B show");
    }
}

public class One {
    public static void main(String[] args) {
        /* Annotation */
        /* Suppliment to the compiler or the runtime */
        /* called as meta data */
        /*
         * To interact with the compiler or the runtime
         */
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}