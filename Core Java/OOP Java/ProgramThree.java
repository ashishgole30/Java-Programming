// METHOD OVERLOADING

class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class ProgramThree {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        int r1 = obj.add(3, 4);
        int r2 = obj.add(1, 2, 3);

        System.out.println(r1);
        System.out.println(r2);
    }
}

// you can have methods with same name but different number of parameters
// or same number of parameters but of different type