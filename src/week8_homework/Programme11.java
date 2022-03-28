package week8_homework;

public class Programme11 {
    //method creting with one parames
    public static int getEvenDigitSum(int number) {
        //write the logic with if condition
        if (number < 0) {
            return -1;//and return -1
        }
        int sum = 0;
        while ((number > 0)) {
            int reminder = number % 10;
            if (reminder % 2 == 0) {
            }
            number /= 10;
        }//reyrn sum
        return sum;
    }//main method and call other method
    public static void main(String[] args) {
        System.out.println((getEvenDigitSum(123456789)));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

}