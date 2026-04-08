class hooman {
    private int age;
    private String name;

    public hooman() {
        age = 12;
        name = "John";
        // Default constructor
    }

    public hooman(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Four {
    public static void main(String[] args) {

        // Constructors
        // 1. Special Method
        // 2. Name same as class name
        // 3. No return type
        // 4. Used to initialize the object
        // 5. Everytime an object is created, constructor is called
        hooman h1 = new hooman();
        hooman h2 = new hooman(18, "Navin");

        System.out.println(h1.getName() + " " + h1.getAge());
        System.out.println(h2.getName() + " " + h2.getAge());
    }
}