// Iterable
//  |
//  v
// Collection
//  |       |       |
// List     Queue  Set    

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Four {
    public static void main(String[] args) {

        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);

        Iterator<Integer> values = nums.iterator();

        // values has methods
        // hasNext() - returns true if there is a next element in the collection
        // next() - returns the next element in the collection

        // next() only gives one element so we use loop
        while (values.hasNext()) // True if there is a next element in the collection
        {
            System.out.println(values.next());
        }
    }
}