package ca.roumani.myapplication;

/**
 * Created by user on 1/22/18.
 */
public class PersonTest
{
    public static void main(String[] args){
        Person p1 = new Person ("Greek",70,1.88);
        Person p2= new Person("John",77,1.79);

     /*   System.out.println("Greek's Bmi is : "+p1.getBMI());
        System.out.println("John's Bmi is :"+p2.getBMI());*/

        System.out.println(p2.toString());
        System.out.println(p1.toString());

        System.out.println("After Greek has gained 5 kg ");
        p1.setWeight(p1.weight +5);
        System.out.println("After John has lost 4 kg");
        p2.setWeight(p2.weight -4);
        System.out.println(p2.toString());
        System.out.println(p1.toString());


    }

}
