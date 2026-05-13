import java.util.Arrays;
import java.util.List;

public class DemoNine {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // Reduce

        // Reduce takes two parameters
        // one is the data type
        // and other is the operation

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        // 0 is the initial value of the result
        // c is the current value of the result
        // e is the current element of the stream
        // c + e is the operation to be performed on the current value of the result and
        // the current element of the stream

        System.out.println(result);
    }
}