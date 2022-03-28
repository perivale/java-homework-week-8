package Programme17;

public class Floor {
 //   public final double length;
    //i.variable
    double width;
    double lenght;

    //create a constructor with params
    public Floor(double width, double length) {
        this.width=width;
        this.lenght=length;
      ///  this.width = width;
       // this.le
        if (length < 0) {
            this.lenght= 0;
        } else if (width < 0) {
            this.width = 0;
        }
    }

    public double getArea() {
        return width* lenght;
    }
        }







