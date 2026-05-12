import java.util.Set;
import java.util.TreeSet;

public class Three {
    public static void main(String[] args) {

        // What if you want a sorted value
        // We use tree set for that
        Set<Integer> nums = new TreeSet<Integer>();
        // we can also write
        // Collection <Integer> nums = new TreeSet<Integer>();

        nums.add(6);
        nums.add(3);
        nums.add(8);
        nums.add(6);

        for (int n : nums) {
            System.out.println(n);
        }

    }
}