class Humann {
    private int age;
    // By using the private keyword
    // the variable age and name is only accessible within the same class
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}
// so the age and name variables will be used by their own methods

public class Two {
    public static void main(String[] args) {
        // Encapsulation
        Humann obj = new Humann();

        obj.setAge(30);
        obj.setName("Navin");
        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}