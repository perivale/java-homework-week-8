package week8_homework;

import java.util.Scanner;

//java scaneer to write in console
public class Programme9 {
    //crate method to write ligic with for loop
    public void method1() {
        int num, a = 1, b = 1, c;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");     //1 1 2 3 5 8 13 21
            c = a + b;              //c=1+1
            a = b;              //a=1
            b = c;
        }
    }
        //main method and call method1 via obj
    public static void main(String[] args) {
        Programme9 obj = new Programme9();  //create obj to call  method1
        obj.method1();

    }
}
