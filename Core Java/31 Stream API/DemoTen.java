import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoTen {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

        // what if you want to do filtering
        // but with multiple threads

        Stream<Integer> sortedValuestwo = nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .sorted();
        // dont use parallel stream with sorted because it will not work as expected
        sortedValues.forEach(n -> System.out.println(n));

    }
}