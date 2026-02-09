import java.util.Scanner;
public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int flag = 0;

        if (num <= 1) {
            flag = 1;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");

        sc.close();
    }
}

