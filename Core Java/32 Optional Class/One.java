import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class One {
    public static void main(String[] args) {

        // Optional Class

        List<String> names = Arrays.asList("John", "Mark", "Laxmi", "Pravin", "Kiran");

        // String name = names.stream().filter(str -> str.contains("x")).findFirst();
        // Findfirst gives us optional string
        // not a String
        // Optional class came to solve error null pointer exception

        Optional<String> name1 = names.stream().filter(str -> str.contains("x")).findFirst();

        // System.out.println(name.get());
        // gives us the required output
        // else gives us exception

        System.out.println(name1.orElse("Not Found"));
        // gives us the required output
        // else gives us not found

        // Without using optional class
        String name2 = names.stream().filter(str -> str.contains("x")).findFirst().orElse("Not Found");
        System.out.println(name2);

    }
}