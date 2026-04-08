class Humannn {
    private int age;
    // By using the private keyword
    // the variable age and name is only accessible within the same class
    private String name;

    // getters and setters
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
// so the age and name variables will be used by their own methods

public class Three {
    public static void main(String[] args) {
        // Encapsulation
        Humannn obj = new Humannn();

        obj.setAge(30);
        obj.setName("Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}