package week8_homework;

public class DigitSumChallenge {

    //create method for write logic and using  if..else  condition
    public static int SumDigits(int num) {
        if(num<10){
            return-1;
        }
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        return sum;
    }       //main method to call other method
        public static void main(String[] args) {
        SumDigits(125);
        SumDigits(1);

    }

}
