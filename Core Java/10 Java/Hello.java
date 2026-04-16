public class Hello {
    int marks = 8; // default

    public void show() {
        System.out.println("in show");
    }

    private int number = 5;

    protected int num = 5;
}

class Launch {
    public void abc() {
        Hello obj = new Hello();
        System.out.println(obj.num);
    }
}