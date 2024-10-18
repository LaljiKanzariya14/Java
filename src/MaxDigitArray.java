import java.util.Arrays;

public class MaxDigitArray {

    public static void main(String arg[]){
        int number = 1238569;

        // Convert the number to a string and split into an array of digits (as characters)
        String numberStr = String.valueOf(number);
        char[] digits = numberStr.toCharArray();

        // Convert character array to integer array for comparison
        int[] digitArray = new int[digits.length];

        for(int i=0; i< digits.length; i++){
            digitArray[i] = Character.getNumericValue(digits[i]);
        }

        // Sort the array and get the maximum digit (last element in the sorted array)
        Arrays.sort(digitArray);
        int maxDigit = digitArray[digitArray.length - 1];
        System.out.println("The maximum digit is: " + maxDigit);
    }
}
