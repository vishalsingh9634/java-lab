// *Write a Java program to illustrate constructor overloading in a BankAccount class with account number, name, and balance.*

public class bankaccount {
    int account_no;
    String name;
    float balance;


    bankaccount(int a,String n,float b){
        account_no=a;
        name=n;
        balance=b;
    }

    void display(){
        System.out.println("account number :"+account_no);
        System.out.println("Name :"+name);
        System.out.println("Balance :"+balance);
    }



    public static void main(String[] args) {
        bankaccount bank=new bankaccount(484846, "vishal", 14000);
        bank.display();
    }
}
