import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOne {
    public static void main(String[] args) {

        // SORTING
        // lets say you have a collection
        // and you want to sort it
        // how will you do it

        List<Integer> nums = new ArrayList<>();
        // only need to assign data type value to the left hand side

        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(1);

        System.out.println("Before sorting: " + nums);

        Collections.sort(nums); // this will not work because Collection does not have a sort method
        System.out.println("After sorting: " + nums);
    }
}