import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student Age: " + age + " Name : " + name;
    }
}

public class SortingThree {
    public static void main(String[] args) {

        // SORTING

        // without lambda expression
        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // with lambda expression since its a FUNCTIONAL INTERFACE
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Pravin"));
        studs.add(new Student(20, "kiran"));

        Collections.sort(studs, com);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}

// Comparator
// if you want to specify on which logic you want to sort
// the elements you can use Comparator

// Comparable
// If you want to give the power to the class itself
// to compare itself or to compare its object to itself
// we can use comparabale there