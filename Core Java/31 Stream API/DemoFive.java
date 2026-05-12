import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoFive {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);

        // filter (predicate , which means condition)

        s2.forEach(n -> System.out.println(n));
        // we only got even values

        s3.forEach(n -> System.out.println(n));
        // we got double the values of s2

        // stream also has reduce method

    }
}