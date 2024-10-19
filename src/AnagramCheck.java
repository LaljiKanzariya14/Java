import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        System.out.println(charArr1);
        System.out.println(charArr2);

        boolean result = Arrays.equals(charArr1, charArr2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
