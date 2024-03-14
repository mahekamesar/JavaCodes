/*In Java, the method reverse() in the Class Collections is used to reverse collections
        like List, ArrayList, LinkedList, etc. So, the array can be
        reversed using this method by first converting it into a List
        and then using the reverse() method of the Collections class.*/
import java.util.*;

public class ReverseArray1 {
            public static void reverse(Integer[] arr) {
                Collections.reverse(Arrays.asList(arr));
                System.out.println(Arrays.asList(arr));
            }
            public static void main(String[] args) {
                Integer[] arr = {1,2,3,4,5};
                reverse(arr);
            }
        }

        //Time Complexity : O(n) as internally, the array will first be converted into list and all the elements will be traversed.
        // Space Complexity : O(1) as internally, Java will use an auxiliary list and reverse it.

