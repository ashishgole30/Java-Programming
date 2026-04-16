class Calc {
    // I DONT WANT ANYONE TO OVERRIDE MY METHOD
    // FOR THIS USE FINAL
    public final void show() {
        System.out.println("By Navin");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

class AdvCalc extends Calc {
    public void show() // Cannot override the final keyword
    {
        System.out.println("By John");
    }
}

public class FinalKeywordThree {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 5);
    }
}

// SUMMARY
// 1. You can make a variable final to make it constant
// 2. You can make a class final to stop inheritance
// 3. You can make a method final to stop method overriding