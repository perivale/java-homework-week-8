package Programme20;

public class Cuboid  extends  Rectangle{
    //instance variable
     double height;
//create constractor
    public Cuboid(double width, double length, double height) {
        //super keyword to call other class method to in child class
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }
//to getheight method with return in double
    public double getHeight() {
        return height;
    }
//to get volume method with return in getarea
    public double getVolume() {
        return getArea() * height;
    }
}
