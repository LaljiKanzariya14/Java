import java.util.Arrays;

public class FindDuplicate {
    public static void main(String args[]){
        int[] arr = {10,10,20,30,40,50};

        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i + 1]){
                temp[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}
