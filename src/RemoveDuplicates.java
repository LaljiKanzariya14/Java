import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,8,7,6,5,4,2,3,1};
        //.stream //creates a stream from the List of integers.
         //.distinct()  // Filter out duplicates
        // .toArray();  // Convert back to an array

        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }
}
