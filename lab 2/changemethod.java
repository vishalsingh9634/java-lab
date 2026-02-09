// *Write a Java program to illustrate method overloading by changing the number of arguments in a Display class.*
public class changemethod {

    void show() {
        System.out.println("No arguments");
    }

    void show(int a) {
        System.out.println("One argument: " + a);
    }

    void show(int a, int b) {
        System.out.println("Two arguments: " + a + " " + b);
    }

    public static void main(String[] args) {
        changemethod d = new changemethod();

        d.show();
        d.show(5);
        d.show(10, 20);
    }
}
