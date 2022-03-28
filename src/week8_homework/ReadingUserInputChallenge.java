package week8_homework;

import java.util.Scanner;
//java scanner to write number in console
public class ReadingUserInputChallenge {
    //create method to write in logic
    public static void method1() {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("enter number #" + count + ":");
        //if ..else condition
            boolean isAnInt = input.hasNextInt();
            if (isAnInt) {
                int number = input.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("invalid number::");
            }
            input.nextLine();
        }
        System.out.println("sum of all number" + sum);
        input.close();
    }//main method and call other method /..
    public static void main(String[] args) {

        method1();
    }
    }










