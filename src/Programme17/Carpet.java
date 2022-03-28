package Programme17;

public class Carpet {
    //instance variable
    double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;

    }

}



