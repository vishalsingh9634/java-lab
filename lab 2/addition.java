// *Write a Java program to illustrate method overloading by performing addition of integers, floats, and doubles.*

public class addition {
    int add(int a,int b){
        return a+b;

    }

    float add(float a,float b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        addition sum=new addition();
        System.out.println("integer :"+sum.add(5,4));
        System.out.println("Float :"+sum.add(5.4,4.2));
        System.out.println("Doubles :"+sum.add(5.5,4));
    }
}
