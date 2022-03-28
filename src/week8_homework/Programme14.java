package week8_homework;

public class Programme14 {
    //create method nested for loop
    public void method1() {
        int i, j, k;    //int value
        for (i = 1; i <= 5; i++) {  //for loop syntax
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");  //print in * on console

            }
            System.out.print("\n");
        }
        for (i = 4; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");      //print in*on console
            }
            System.out.print("\n");
        }

    }
        // create a main method and call method1 via obj
    public static void main(String[] args) {
        Programme14 obj=new Programme14();      //create obj to call i.method
        obj.method1();
    }
}