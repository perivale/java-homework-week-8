package week8_homework;

public class Programme5 {
    //creteing method with parameter int type and using while loop
    public static boolean isPalindrome(int number) {
        boolean result;
        System.out.println("is return true");
        int rev = 0;  //i.variable
        int orinumber = number;   //i.variable
        //while condition

        while (number != 0) {
            int lastdigit = number % 10;
            rev = (rev * 10) + lastdigit;
            number /= 10;
          //  System.out.println("is not return false");

        }while(number!=0){
            rev*=10;
            int lastdigit=number%10;
            rev+=lastdigit;
            number/=10;
        }
        //return rev in orignalnumber
        return orinumber == rev;
    }      //main method and call Ispalindrome method via class name
    public static void main(String[] args) {
        Programme5.isPalindrome(-1221);
        Programme5.isPalindrome(707);
        Programme5.isPalindrome(11212);

    }
}
