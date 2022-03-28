package Programme17;

import java.util.Scanner;
//java scaneer to write in console
public class Main {
    //main class have main method and call all other method to this main class
    public static void main(String[] args) {
        Carpet carpet=new Carpet(3.5);//cost of carpet
        Floor floor =new Floor(2.75,4.0);//width and lenght of floor
        Calculator  calculator=new Calculator(floor,carpet);
        System.out.println("total="+calculator.getTotalCost());
        carpet=new Carpet(1.5);
         floor=new Floor(5.4,4.5);
        calculator =new Calculator(floor,carpet);
        System.out.println("total="+calculator.getTotalCost());


    }

}
