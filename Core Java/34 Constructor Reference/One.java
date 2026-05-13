import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name : " + name + " Age : " + age;
    }

}

public class One {
    public static void main(String[] args) {

        // Constuctor Reference

        List<String> names = Arrays.asList("Jack", "Jill", "Johnson");

        List<Student> students = new ArrayList<>();

        // Without using Stream API

        // for (String name : names) {
        // students.add(new Student(name));
        // }
        // System.out.println(students);

        // Using Stream API

        // students = names.stream().map(name -> new Student(name)).toList();
        // System.out.println(students);

        // using contrucor reference
        students = names.stream()
                .map(Student::new)
                .toList();
        System.out.println(students);

    }
}