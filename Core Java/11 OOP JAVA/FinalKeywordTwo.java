final class Calc {
    public void show() {
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    // NO ONE CAN EXTEND CALC CLASS
}

class AdvCalc extends Calc {
    // By default any class can inherit another class by extends
    // to stop extend a class
    // use final keyword for parent class

}

public class FinalKeywordTwo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }
}