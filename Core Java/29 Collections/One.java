import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class One {
    public static void main(String[] args) {

        // Collection - Interface
        // belongs to java.util package

        // Collection
        // 1) list -> ArrayList, LinkedList
        // 2) set -> HashSet, LinkedHashSet
        // 3) queue -> Deque

        // we havent mentioned type of collection
        // Collection nums = new ArrayList();

        // So we need to mention type of collection

        Collection<Integer> nums1 = new ArrayList<Integer>();

        // <> is called diamond operator
        // its called generic type
        // it is used to specify type of collection

        nums1.add(6); // these values are actually object type if <Integer> is not mentioned
        nums1.add(7);
        nums1.add(8);
        nums1.add(9);

        // You cannot simply print an array
        // you need to use a loop right
        // But thats not the case with collection
        System.out.println(nums1); // this will print the collection in a readable format
        // we get warning not an error
        // we also get output

        System.out.println("-----------------------------");
        for (int n : nums1) {
            System.out.println(n);
        }

        System.out.println("-----------------------------");
        // Collection does not provide index based access
        // however list supports index based access

        List<Integer> nums2 = new ArrayList<Integer>();

        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);

        // list does support repeated values
        System.out.println(nums2.get(3)); // this will print 9
        System.out.println("-----------------------------");
        System.out.println(nums2.indexOf(6));
    }
}
