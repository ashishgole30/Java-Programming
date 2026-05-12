import java.util.Arrays;
import java.util.List;

public class DemoTwo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("---------");
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("---------");
        nums.forEach(n -> System.out.println(n));
    }
}