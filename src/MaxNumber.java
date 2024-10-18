public class MaxNumber {

    public static void main(String args[]){
        int number = 1238925;
        int maxNumber = 0;

        while (number > 0) {                                            //continues until all digits are processed.
            int currentNumber = number % 10;                            //extracts the last digit of the number
            System.out.println("currentNumber:-"+ currentNumber);
            if(currentNumber > maxNumber){                             //variable holds the largest digit
                maxNumber = currentNumber;
            }
            number = number / 10;                                       //removes the last digit of the number
            System.out.println("number:-"+ number);
        }
        System.out.println("Maximum Number is:-"+ maxNumber);
    }
}
