import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,40,60};
        int secongLarge = arr[0];
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > secongLarge){
                secongLarge = arr[i];
            }
        }
        System.out.println(secongLarge);
    }
}
