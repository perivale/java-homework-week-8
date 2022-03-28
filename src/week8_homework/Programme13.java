package week8_homework;

public class Programme13 {
    //create satic method to write logic
    public static boolean hasSharedDight(int firstNumber,int secondnumber){
        if((firstNumber>=10 && firstNumber<=99) && (secondnumber>=10&&secondnumber<=99)){
            int firstNumberLastDigit=firstNumber%10;
            int secondNumberLastDight=secondnumber%10;
            firstNumber/=10;
            secondnumber/=10;
            int firstNumberFristDigit=firstNumber;
            int secondnumberFirstDigit=secondnumber;
            System.out.println("Is there any shard digit in both given numbers?");
            return ((firstNumberFristDigit==secondnumberFirstDigit) || (firstNumberFristDigit==secondNumberLastDight)||(firstNumberLastDigit==secondnumberFirstDigit)||(firstNumberLastDigit==secondNumberLastDight));
        }
        System.out.println(("invalid input"));
        return false;
    }//write main method to call other mathod
    public static void main(String[] args) {
        System.out.println(hasSharedDight(12,23));
        System.out.println(hasSharedDight(9,99));
        System.out.println(hasSharedDight(15,55));
    }

    }