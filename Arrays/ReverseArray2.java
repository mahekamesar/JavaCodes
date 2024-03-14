import java.util.*;
//Reverse using index

public class Main {
    
    public static void reversePrint(int[] arr) {
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reversePrint(arr);
    }
}

/* Time Complexity: The time complexity of this method is O(N) as we are just 
printing the array in reverse and printing an array in reverse requires traversing the entire array of N elements.

        Space Complexity (Auxiliary Space): The auxiliary space is O(1) as we have not used any extra space.*/
