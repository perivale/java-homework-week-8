package week8_homework;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
//create method to write logic and call in main method
        public  static void method1() {
            //using java scanner to write in console
            Scanner scanner = new Scanner(System.in);
            boolean isFirstNumber = true;
            int min = 0;
            int max = 0;
            while (true) {
                System.out.println("enter the number");
                boolean isAnInt = scanner.hasNextInt();
                //if else condition
                if (isAnInt) {
                    int number = scanner.nextInt();
                    if (isFirstNumber) {
                        min = number;
                        max = number;
                        isFirstNumber = false;
                    }
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                } else {
                    break;
                }

            }
        }//main method and call method1 in main mathod
            public static void main(String[] args){
                method1();


            }    }