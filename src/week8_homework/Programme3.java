package week8_homework;

import java.util.Scanner;
//java scanner for use write in console
public class Programme3 {
    //create main method and call method1 in main method
   public static void main(String[] args) {
       Programme3 obj=new Programme3();
       obj.method1();
   }//create instance method to write logic
   public void method1(){
      // scanner calling syntax
        Scanner in=new Scanner(System.in);
        System.out.println("input an alphabet:");
        String input= in.next().toLowerCase();
        boolean uppercase=input.charAt(0)>=65&&
                input.charAt(0)<=90;
        boolean lowercase=input.charAt(0)>=97&&
                input.charAt(0)<=122;
        boolean vowels=input.equals("a")||input.equals("e")||
                input.equals("i")||input.equals("o")||input.equals("u");
        //if else condition to write logic
        if(input.length()>1) {
            System.out.println("error.not a single charcter");
        }
        else if(!(uppercase||lowercase)) {
            System.out.println("error not a letter .enter uppercase or lowercase letters");
        }
        else if(vowels) {
            System.out.println("input letter is vowel");
        }else
        {
            System.out.println("input letter is consonant");
        }
    }

}
