public class Six {
    public static void main(String[] args) {
        // METHOD OVERRIDING

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {
        return a + b + 1;
    }

}