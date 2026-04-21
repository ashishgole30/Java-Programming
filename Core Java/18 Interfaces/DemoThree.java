interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("coding on laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("coding on desktop");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class DemoThree {
    public static void main(String[] args) {
        // NEED OF INTERFACES

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(lap);

    }
}

// EXPLANATION:-
/*
 * 🔹 1. Interface Computer
 * interface Computer {
 * void code();
 * }
 * interface is like a contract
 * It says: any class using me MUST implement code() method
 * No implementation here, only method declaration
 * 👉 Meaning: “Any computer should be able to code”
 * 
 * 🔹 2. Class Laptop
 * class Laptop implements Computer {
 * public void code() {
 * System.out.println("coding on laptop");
 * }
 * }
 * implements Computer → follows the interface rule
 * Provides its own version of code()
 * 👉 Output when used: coding on laptop
 * 
 * 🔹 3. Class Desktop
 * class Desktop implements Computer {
 * public void code() {
 * System.out.println("coding on desktop");
 * }
 * }
 * Also implements Computer
 * Same method name, different behavior
 * 👉 Output: coding on desktop
 * 
 * 🔹 4. Class Developer
 * class Developer {
 * public void devApp(Computer lap) {
 * lap.code();
 * }
 * }
 * Takes a Computer type object
 * Doesn’t care if it’s Laptop or Desktop
 * Just calls code()
 * 👉 This is called Abstraction + Polymorphism
 * 
 * 🔹 5. Main Method
 * Computer lap = new Laptop();
 * Computer desk = new Desktop();
 * Reference type = Computer
 * Object type = Laptop / Desktop
 * 👉 This is runtime polymorphism
 * Developer dev = new Developer();
 * dev.devApp(lap);
 * Passes Laptop object
 * Calls code() → prints:
 * coding on laptop
 * 
 * 🔥 Key Concepts Used
 * Interface → defines rules
 * Implements → classes follow rules
 * Polymorphism → same method, different behavior
 * Loose coupling → Developer doesn’t depend on specific class
 * 
 * 💡 Real-Life Analogy
 * Think:
 * Computer = charging port standard 🔌
 * Laptop & Desktop = different devices
 * Developer = person using it
 * Developer doesn’t care what device it is → just wants it to “work”
 * 
 * ✅ Final Conclusion (Important for exams)
 * Interface provides flexibility
 * Makes code scalable & reusable
 * Allows multiple implementations
 */