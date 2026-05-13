import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        // Method Reference

        // Withous Using Method Reference
        List<String> names1 = Arrays.asList("Navin", "Harsh", "John");
        List<String> uNames1 = names1.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(uNames1);

        // Using Method Reference
        List<String> names2 = Arrays.asList("Jack", "Jill", "Johnson");
        List<String> uNames2 = names2.stream().map(String::toUpperCase).toList();
        System.out.println(uNames2);
        // passing a method to a method
        // toUpperCase belongs to a String Class
        // so we use String ::
        // this is called method reference
    }
}