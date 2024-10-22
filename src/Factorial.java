public class Factorial {
    public static void main(String args[]){
        int factorial = 1;
        int i;

        for(i=1; i<=5; i++){
            factorial = factorial*i;
            System.out.println("Factorial of "+ i + " is:"+ factorial);
        }
    }
}
