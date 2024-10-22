public class MissingNumberArray {
    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9, 10};
        int number = 10;

        for (int i = 1; i <= number; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i);
            }
        }
    }
}
