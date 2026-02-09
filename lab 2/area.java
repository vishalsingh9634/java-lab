// *Write a Java program to illustrate method overloading by calculating area of different shapes (circle, rectangle, square).*

public class area {
    double calculate(double r){
        return 3.14*r*r;
    }
    double calculate(double l,double b){
        return l*b;

    }

    int calculate(int s){
        return s*s;
    }

    public static void main(String[] args) {
        area a = new area();
        System.out.println("area of circle :"+a.calculate(5.5));
        System.out.println("area of rectangle :"+a.calculate(5,4));
        System.out.println("area of Square :"+a.calculate(5));
    }
}
