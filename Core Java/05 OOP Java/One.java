class Human {
    private int age = 11;
    // By using the private keyword
    // the variable age and name is only accessible within the same class
    private String name = "Navin";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // so the age and name variables will be used by their own methods
}

public class One {
    public static void main(String[] args) {
        // Encapsulation
        Human obj = new Human();

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}