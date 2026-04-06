class Calulator
// class keyword class_name
{

    // variable - what object knows
    int a;

    // method - what object does
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class ProgramOne {
    public static void main(String[] args) {

        // OBJECT ORIENTED PROGRAMMING

        // object knows something and does something
        // pen - color,height,brand , can write

        // Object - Behaviour & Property

        // Class - Blueprint
        // JVM CREATES OBJECTS ,But give blueprint to jvm
        int num1 = 4;
        int num2 = 5;

        Calulator calc = new Calulator();
        // class name ;refence variable name = new keyword; constructor

        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}

// JDK JAVA DEVELOPMENT KIT
// when u write a code , you have to convert it into bytecode
// because what ultimately runs on the machine is a bytecode
// java code ->compile it->convert into bytecode which run on the machine
// this machine is JVM JAVA VIRTUAL MACHINE
// compile the code with JDK and run on JVM

// JRE JAVA RUNTIME ENVIRONMENT
// JRE HAS ALL THE EXTRA FILES EXTRA CLASSES , INBUILT CLASSES, VALIDATES
// BYTECODE

// But ultimately code runs on jvm
// jvm is a part of jre
// as a developer you install jdk so u het jre and jvm

// JDK
// JRE
// JVM