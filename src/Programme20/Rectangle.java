package Programme20;

public class Rectangle {
    //teo instance variable
     double width;
     double length;
//one constractor with two pramrs
    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }
//method name get width
    public double getWidth() {
        return width;
    }
//method name get lenght
    public double getLength() {
        return length;
    }
//mathod name getarea
    public double getArea() {
        return width * length;
    }


}
