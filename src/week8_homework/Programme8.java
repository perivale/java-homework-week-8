package week8_homework;

import java.util.Scanner;
//usev java util scaneer for write in console
public class Programme8 {

    private static Scanner input;
// main method creating and call m1 mrthod
    public static void main(String[] args) {
        m1();
    }
//creating static method and use scanner
        public static void m1(){
        //scaneer calling obj sentax
         input=new Scanner(System.in);
        System.out.print("Enter angle triangle of @ pattern");
       int row =input.nextInt();

        System.out.println("printing right angle triangle in @ pattern ");
        for(int i=1 ;i<=row; i++){
            for(int j=1 ;j<=i; j++){
                System.out.print("@ ");
            }
            System.out.println();
        }


    }


}
