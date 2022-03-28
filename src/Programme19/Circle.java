package Programme19;
//import static java.util.Math.PI.
public class Circle {

    //instance variable
    public double radius;
    public static final double PI=3.14;

    //constructor
    public Circle(double r){
        if(r<0){
            r=0;
        }
        radius=r;
    }
    //instance method
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return(radius*radius*PI);
    }
}
