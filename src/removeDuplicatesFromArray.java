import java.util.Arrays;

public class removeDuplicatesFromArray {
    public static void main(String[] args){
        int[] arr = {10,10,30,40,50,50,40,30,70,60,20,20,60,70};

//        if(arr.length == 0 || arr.length == 1){
//            return arr; // No duplicates if 0 or 1 element
//        }

        // Sort the array first to bring duplicates together
        Arrays.sort(arr);
        System.out.println("arr:-"+ Arrays.toString(arr));

        // Create a temporary array to store unique elements
        int[] temp = new int[arr.length];
        int j = 0;  // Index for the new array

        // Iterate over the sorted array and remove duplicates
        for(int i=0; i< arr.length-1; i++){
            System.out.println("arr[i]:-"+ arr[i] + "|| arr[i + 1]:-" + arr[i + 1]);
            if (arr[i] != arr[i + 1]){
                temp[j++] = arr[i];  // Add the unique element
            }
        }

        // Add the last element, as it's not checked in the loop
        temp[j++] = arr[arr.length - 1];

        System.out.println("Array after removing duplicates: " + Arrays.toString(temp));
    }
}
