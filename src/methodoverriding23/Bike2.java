package methodoverriding23;
//creting a child class
public class Bike2 extends Vehicle{
    //defining the same method as in the paraent class
    public  void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();//creting obj
        obj.run();//calling method
    }
}
