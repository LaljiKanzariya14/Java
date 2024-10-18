public class MaxNumberFromArray {
        public static void main(String args[]){
            int number[] = {1,2,3,8,9,2};
            int maxNumber = number[0]; // Assume the first element is the largest

            // Iterate through the array starting from the second element
            for(int i=1; i<number.length; i++){
                if(number[i] > maxNumber){   //If number is less than max number then number stored in max number var
                    maxNumber = number[i];  //
                }
            }
            System.out.println("Maximum Number is:-"+ maxNumber);
        }
}
