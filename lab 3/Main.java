/*write a java program where student inherit from person.
read name and age in the parent class and roll number and course in the child class
display all details using a child class object. */ 

import java.util.*;

class Person {
    String name;
    int age;

    void persondetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name :");
        name = sc.nextLine();
        System.out.println("enter the age :");
        age = sc.nextInt();
        
    }
}

class Student extends Person {
    int roll;
    String course;

    void studentdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the roll number :");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the course:");
        course = sc.nextLine();
    }

    void display() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("roll number : " + roll);
        System.out.println("course : " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.persondetails();
        s.studentdetails();
        s.display();
    }
}
