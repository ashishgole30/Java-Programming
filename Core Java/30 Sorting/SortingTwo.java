import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTwo {
    public static void main(String[] args) {

        // SORTING

        // based on your own logic
        // use a comparator to sort based on your own logic
        // comparator is an imterface

        // in terms on anonymous class
        // its is compulsory to mention the data type of the comparator on both the
        // sides
        // lhs and rhs
        Comparator<Integer> com = new Comparator<Integer>() {

            // Collections works with the wrapper classes
            // so use class names
            // <Integer> instead of int
            public int compare(Integer i, Integer j) {
                // return 1 = swap
                // return -1 = not swap
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}

// Question
// Create a list of string and sort the list based on length of the string