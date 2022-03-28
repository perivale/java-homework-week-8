package week8_homework;

public class Programme15 {
  //  instance variable
  int n=5;
  int i=1;
  int j=4;
  int k=1;
  //create method and write logic with for loop condition
  public void method1(){
      for(i=1;i<=n;i++){
          for(j=n-1;j>=i;j--){
              System.out.print(" ");
          }
          for(k=1; k<=i; k++){
              //print statement as *
              System.out.print("*");
          }
          System.out.print("\n");
      }
  }
        // create main method and call method1..
    public static void main(String[] args) {
        Programme15 obj=new Programme15();
        obj.method1();
    }

}
