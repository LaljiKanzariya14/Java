public class ReverseString {
    public static void main(String args[]){

        String input = "Lalji Kanzariya";
        String reverse = "";

        for(int i=input.length()-1; i>=0; --i){
            reverse += input.charAt(i);
        }
        System.out.println(reverse);

        //Revere string using split
        String[] split = input.split("\\s+");
//        System.out.println(split[0]);
//        System.out.println(split[1]);
        String reverse1 = "";
        String reverse2 = "";

        for (int i=split[0].length() - 1; i>=0; --i){
            reverse1 += split[0].charAt(i);
        }

        for(int j=split[1].length()-1; j>=0; --j){
            reverse2 += split[1].charAt(j);
        }

        System.out.println(reverse1 +" "+ reverse2);
    }
}
