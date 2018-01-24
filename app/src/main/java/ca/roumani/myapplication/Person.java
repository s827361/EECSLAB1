package ca.roumani.myapplication;

/**
 * Created by user on 1/22/18.
 */
public class Person
{
    double weight;
    double height;
    String name;
    public Person(String n, double w, double h){
        this.name=n;
        this.height=h;
        this.weight=w;

    }
    double getBMI(){
        double bmi = weight/(height * height);
        return bmi;

    }
    public String toString(){
       String s = "";

        s = s  +  this.name;
        s +=  "'s BMI is ";
        //double bmi = this.weight/(this.height * this.height);
        double bmi = this.getBMI();
        String bbmi = String.format("%.2f",bmi);


        s += bbmi;
       if( bmi<18.5){
          s += "You are underweight";

      }
        if(bmi<25 && bmi>18.5){
            s += "You are Normal";
        }
        if(bmi>25 && bmi<30){
            s += "You are Overweight";
        }
        if(bmi>30){
            s += "You are Obese";
        }
        return s;


    }
    void setWeight(double w){
        this.weight=w;

    }
    void setHeight(double h){
        this.height = h;

    }
}
