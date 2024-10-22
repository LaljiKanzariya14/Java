public class PrimeNumber {
    public static void main(String args[]){
        int number = 29; // Change this number to test
        boolean isPrime = isPrime(number);
        System.out.println(number + " is prime: " + isPrime);
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it is prime
    }
}
