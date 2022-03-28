package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //set value of the variable
        obj.setName("shilpa");
        obj.setAge(19);
        obj.setRollno(51);

        //displying value of the variable
        System.out.println("prime's name:" + obj.getname());
        System.out.println("prime's age:" + obj.getAge());
        System.out.println("prime's roll no:" + obj.getRollno());

        //direct access of rollno is not possible  dur to encapsulation
        //system.out.println("primes roll no ;"+obj.geekName);

    }
}