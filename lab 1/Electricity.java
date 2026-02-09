public class Electricity {
    String accNo;
    String name;
    int unit;
    double bill;

    public Electricity(String accNo, String name, int unit) {
        this.accNo = accNo;
        this.name = name;
        this.unit = unit;
        this.bill = 0;
    }

    void calculateBill()
    {
        if (unit <= 150)
             {
            bill = unit * 3.00;
        } 
        else if (unit <= 300) 
            {
            bill = unit * 4.00;
        } 
        else 
            {
            bill = unit * 5.50;
        }
    }
    void appliedoffer()
    {
        if(this.bill>3000 && this.bill<=5000)
            {
            this.bill=this.bill-(this.bill*0.05);
        }

        else if(this.bill>5000)
            {
            this.bill=this.bill-(this.bill*0.10);
        }
    }

    void displayBill() {
        System.out.println("----- Electricity Bill -----");
        System.out.println("Account Number : " + accNo);
        System.out.println("Customer Name : " + name);
        System.out.println("Units Consumed: " + unit);
        System.out.println("Total Bill    : ₹" + bill);
    }
    public static void main(String[] args) {
        Electricity customer1 = new Electricity("123", "Vishal Singh", 360);
        customer1.calculateBill();
        customer1.appliedoffer();
        customer1.displayBill();
    }
}
