public class VowelConsonantCounter {
    public static void main(String args[]){
        String input = "Lalji Kanzariya";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for(char c: input.toCharArray()){
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
