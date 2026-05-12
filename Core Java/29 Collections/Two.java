import java.util.HashSet;
import java.util.Set;

public class Two {
    public static void main(String[] args) {

        // Collection which will only have unique values
        // Set supports unique values

        // Set extends collection
        // but the class which implements set is different
        // the class name is hashset

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(6);
        nums.add(3);
        nums.add(8);
        nums.add(6); // this will not be added to the set because set does not support duplicate
                     // values

        // set does not support index based access

        for (int n : nums) {
            System.out.println(n);
        }

        // We cant have a repeated value
        // the output is not following the sequence
        // and its not even sorted

    }
}