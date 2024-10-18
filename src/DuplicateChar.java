public class DuplicateChar {
    public static void main(String args[]){
        String input = "Lalji Kanzariya";

        // Create an array to store frequencies of characters (assuming ASCII characters)
        int[] charCount = new int[256];

        // Convert input string to lowercase to make it case-insensitive
        input = input.toLowerCase();

        /// Convert input string to character array
        char[] charArray = input.toCharArray();

        // Count frequency of each character
        for (char c : charArray) {
            charCount[c]++;
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}
