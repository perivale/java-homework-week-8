package week8_homework;

import java.util.Scanner;
//java.util.scanner to write on console
public class Programme6 {
    int num;        //variable create
    //create method to write the logic for for loop
    public void test1(){
        Scanner input=new Scanner(System.in);
        System.out.print("please enter the number of rows");
      num = input.nextInt();
      for(int i=1; i<=num; i++){        //for statement
          for(int j=1; j<=i; j++){
              System.out.print(j);      //print statement
          }
          System.out.println("");
      }
    }       //call test1 method in main method
    public static void main(String[] args) {
        Programme6 obj=new Programme6();    //via obj to call test1
        obj.test1();

    }

}
