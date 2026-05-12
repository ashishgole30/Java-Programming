import java.util.HashMap;
import java.util.Map;

public class Five {
    public static void main(String[] args) {

        // Map

        // Map is not implementation
        // or is does not extend collection interface
        // But its a part of collection concept , collectionframework

        // list
        // 56 , 23 , 67 , 92
        // indexes 0 , 1 , 2 , 3

        // Map
        // 56 , 23 , 67 , 92
        // different indexes name
        // instead of 0,1,2,3
        // we can have
        // ashish , harsh , ankit , rahul
        // possible with key value pair

        // key value
        // H 23
        // A 56 --> MAP
        // R 92
        // K 24
        // map is a collection of key value pair

        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Rahul", 78);
        students.put("Ankit", 89);
        students.put("Harsh", 67);
        students.put("Harsh", 90);

        // add -> add a element
        // put -> add a element, if you already have a element with same key then it
        // will update the value

        // The key cannot be reperated
        // keys are unique
        // Values can be

        System.out.println(students);
        System.out.println("-----------------------------");
        System.out.println(students.get("Navin"));
        System.out.println("-----------------------------");

        // the keys are actually a set
        // the values are actually a list
        // set , list = MAP

        System.out.println(students.keySet());
        System.out.println("-----------------------------");
        System.out.println(students.values());
        System.out.println("-----------------------------");

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}