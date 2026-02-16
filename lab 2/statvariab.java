// *Write a Java program to illustrate the use of a static variable to count the number of employees in an organization.*
public class statvariab {
    static int count=0;
    String name;
    int id;
    statvariab(String name,int id){
        this.name=name;
        this.id=id;
        count++;
    }
    void display(){
        System.out.println("name :"+name);
        System.out.println("id :"+id);
        System.out.println();
    }
    static void showcount(){
        System.out.println("number of employee :"+count);
    }
    public static void main(String[] args) {
        statvariab e1=new statvariab("vishal",201);
        statvariab e2=new statvariab("rahul",202);
        statvariab e3=new statvariab("anjali",203);


        e1.display();
        e2.display();
        e3.display();

        statvariab.showcount();
    }
}
