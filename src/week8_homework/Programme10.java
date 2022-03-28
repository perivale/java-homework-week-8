package week8_homework;

import java.util.Scanner;

//java scanner to write in console
public class Programme10 {
    //creating method for using while loop
    public void test1() {
        int n, arm = 0, rem, c;

        System.out.println("Enter any number");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        c = n;
        //while loop for checking condition
        while (n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm)
            System.out.println("Armstrong number");
        else {
            System.out.println("Armstrong number");
        }
    }       //creating main method and call method test1 via obj
    public static void main(String[] args) {
        Programme10 obj=new Programme10();
        obj.test1();

    }
}
