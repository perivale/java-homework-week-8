package Programme17;

public class Calculator {
    //instance variables
    Floor floor;
    Carpet carpet;

    //create constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    //this method is used to calculte as total cose
    public double getTotalCost() {
        double area = floor.getArea();
        double cost = carpet.getCost();
        return area * cost;
    }
}








