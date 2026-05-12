import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoFour {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Stream is an Interface
        Stream<Integer> s1 = nums.stream();

        // now whatever changes you make to the data
        // will only reflect on s1
        // and original nums data will remain unaffected
        // Once you use the stream you cannot reuse it

        s1.forEach(n -> System.out.println(n));
        s1.forEach(n -> System.out.println(n)); // gives exception

    }
}