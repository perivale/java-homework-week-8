package week8_homework;



public class SimpleCalculator {
    //instance variable
    double firstNumber;
    double secondNumber;
  //  int age;
    //create instance method with params

    public double getFirstNumber() {
        return this.firstNumber;
    }
        //create method with one params
    public double getSecondNumber() {
        return this.secondNumber;
    }
    //create method with differnt params
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
            //create method with diffrent params
    public void setsecondNumber(double secondNumber) {
        this.secondNumber=secondNumber;
    }   //create method to get addition
    public double getAdditionResult() {
        return this.firstNumber+this.secondNumber;
    }       //create method to get subtract
    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }       //create method to get multiply
    public double getMultiplicationResults(){
        return this.firstNumber*this.secondNumber;
    }       //create method to get divied and using if steatement
    public  double getDivisonResult(){
        if(this.secondNumber==0){
            return 0;
        }
        return this.firstNumber/this.secondNumber;
    }
//create main method and call all the metheodvia obj
    public static void main(String[] args) {
        SimpleCalculator calculator=new SimpleCalculator();//create obj
        calculator.setFirstNumber(5.0);
        calculator.setsecondNumber(4);
        System.out.println("add="+calculator.getAdditionResult());
        System.out.println("subtract"+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setsecondNumber(0);
        System.out.println("multiply="+calculator.getMultiplicationResults());
        System.out.println("divide"+calculator.getDivisonResult());

    }


}

