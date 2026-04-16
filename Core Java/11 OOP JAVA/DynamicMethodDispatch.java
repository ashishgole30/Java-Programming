public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();// can also be written as A obj = new B();
        obj.show();
        // Type as parent , but object can be of the child
        // Possible to create a reference of a super class
        // and object of a subclass
        obj = new C();
        obj.show();

        // So the same object is behaving differently for different objects
        // this is runtime polymorphsim
        // which method it will call we are not sure
        // Its dynamic in nature
        // thats why Dynamic Method Dispatch
        // this will only work when you have inheritance
    }
}

class A // Parent
{
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A // Child
{
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}