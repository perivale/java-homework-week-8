package encapsulation26;

public class Encapsulate {
    //private variable decleard these can only be accessed by public method of class
    private String name;
    private int rollno;
    private int age;

    //get method for name to access private variable name
    public String getname() {
        return name;
    }
    //set method for name to access private variable name

    public void setName(String name) {
        this.name = name;
    }
    //get method for roll to acess private variable rollname

    public int getRollno() {
        return rollno;
    }
    //set method for roll to acess private variable rollno

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    //set method for age to access private variable age

    public int getAge() {
        return age;
    }
    //set method for age to access private variable age

    public void setAge(int age) {
        this.age = age;
    }
}




