// TRYING TO USE ABSTRACT CLASSES AND INNER CLASSES TOGETHER

abstract class A {
    public abstract void show();
}

public class DemoTwo {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();

        /*
         * Im providing the implementation of abstract class here itself
         * If you think that we are still creating new A()
         * Isnt that the object of abstract class?We cant do that right
         * // Actually We are not creating object of A
         * // We are actually creating object of the anonymous inner class{
         * public void show() {
         * System.out.println("in new show");
         * }
         * };
         * So if you want to implement the abstract class/interface only once you can
         * use anonymous inner class
         * 
         */
    }
}