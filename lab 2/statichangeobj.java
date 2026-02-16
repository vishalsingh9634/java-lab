// *Write a Java program to illustrate how a static variable is shared among all objects of a class.*
class statichangeobj {
        static int x = 10;

    void display() {
        System.out.println("Value of x: " + x);
    }
public static void main(String[] args) {
    
        statichangeobj obj1 = new statichangeobj();
        statichangeobj obj2 = new statichangeobj();

        obj1.display();

        obj2.x = 50;

        System.out.println("After changing value using obj2:\n");

        obj1.display();
        obj2.display();
    }
}

