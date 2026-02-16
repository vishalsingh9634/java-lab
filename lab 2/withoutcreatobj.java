// *Write a Java program to illustrate a static method for checking eligibility of a student without creating an object.*
public class withoutcreatobj {
    static void vote(int age){
        if(age>=18){
            System.out.println("elligble");
        }
        else{
            System.out.println("not elligble");
        }
    }
    public static void main(String[] args) {
        withoutcreatobj.vote(20);
        withoutcreatobj.vote(15);
        
    }
}
