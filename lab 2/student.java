

public class student {
    String name;
    int age;
    int roll_no;
    String course;

    student(){
        name=" ";
        age=0;
        roll_no=0;
        course=" ";
    }

    student(String n,int a){
        name=n;
        age=a;
        roll_no=0;
        course=" ";
    }

    student(String n,int a,int r,String c){
        name=n;
        age=a;
        roll_no=r;
        course=c;
    }

    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("roll no :"+roll_no);
        System.out.println("course :"+course);
        System.out.println();
    }

    public static void main(String[] args) {
        student s =new student();
        student s1=new student("vishal",24);
        student s2=new student("vishal",24,25483,"mca");

        s.display();
        s1.display();
        s2.display();
    }
}
