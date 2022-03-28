package Programme19;

public class Cylinder extends Circle {

    //instance variable
    public double height;

    //constructor
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            height = 0;
        } else {
            height = height;
        }
    }    //instance method
        public double getHeight() {
            return height;
        }
        public double getvolume () {
            return super.getArea() * getHeight();
        }
    }
