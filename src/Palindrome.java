public class Palindrome {
    public static void main(String[] args) {
        int number = 121; // Change this to test
        boolean isPalindrome = isPalindrome(number);
        System.out.println(number + " is a palindrome: " + isPalindrome); // Output: true
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
