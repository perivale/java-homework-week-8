package week8_homework;

import java.util.Scanner;
//java scanner to write in console
public class Programme12 {
    //create method to write logic using for loop
    public static void method1(){
        int n,num=0;
        //n=3;
        System.out.println("Enter any number");
        //java scanner syntax
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(int i=1; i<=n; i++) {   //i=1
            if (n % i == 0) {
                num++;
            }
            if (num == 2)       //if else stetement
                System.out.println("prime number");
            else
                System.out.println("is not prime number");
        }
    }       //main method to call method1 direct
    public static void main(String[] args) {
    Programme12.method1();      //call method via class name
    }

}
