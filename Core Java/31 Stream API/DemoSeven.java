import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoSeven {
    public static void main(String[] args) {

        // Filter needs an object of a predicate
        // predicate is a interface which has a method called test
        // it returns a boolean value
        // when u apply filter for a particular value
        // if its true it will go ahead
        // otherwise will not go ahead

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Before lambda expression
        // Predicate<Integer> p = new Predicate<Integer>() {
        // public boolean test(Integer n) {
        // if (n % 2 == 0)
        // return true;
        // else
        // return false;
        // }
        // };

        // After lambda expression
        Predicate<Integer> p = n -> n % 2 == 0;

        int result = nums.stream()
                .filter(p)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);
    }
}