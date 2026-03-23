class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount, String user) {
        System.out.println(user + " Withdraw " + amount);

        if (balance >= amount) {
            System.out.println(user);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {}

            balance -= amount;
            System.out.println(user +balance);
        } else {
            System.out.println(user  + balance);
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    String name;

    Customer(BankAccount acc, String name) {
        this.account = acc;
        this.name = name;
    }

    public void run() {
        account.withdraw(700, name);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Customer c1 = new Customer(acc, "User1");
        Customer c2 = new Customer(acc, "User2");

        c1.start();
        c2.start();
    }
}