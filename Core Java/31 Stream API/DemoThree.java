import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoThree {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Before lambda expression

        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };

        // After Lambda expression
        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);

        // Further Reduced to
        nums.forEach(n -> System.out.println(n));

    }
}