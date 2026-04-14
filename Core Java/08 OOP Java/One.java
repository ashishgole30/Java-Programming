public class One {
    public static void main(String[] args) {

        // IMHERITANCE

        // IS , HAS

        // parent class - child class
        // Super class = sub class
        // base class - derived class
        Calc obj1 = new Calc();
        int r1 = obj1.add(4, 5);
        int r2 = obj1.sub(7, 3);

        AdvCalc obj2 = new AdvCalc();
        int r3 = obj2.add(5, 5);
        int r4 = obj2.multi(5, 5);
        int r5 = obj2.div(10, 5);

        System.out.println("Addition :" + r1);
        System.out.println("Subtraction :" + r2);
        System.out.println("Addition :" + r3);
        System.out.println("Multiplication :" + r4);
        System.out.println("Division :" + r5);

    }
}

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}