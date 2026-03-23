/* wap in java to execute ultithreading to perform followinf two tasks
 task1: to display a series of odd number factorial from lower limit to upper limit(both limit have 
 to  passed througgh keyboard)
 tasks2: to display first 5 multiple of all numbers from lower limit to other upper limit
 (both limit have to passed through keyboard)
 
 set the normal priority to task-1 and maximum priority to 
 tasks-2 */

import java.util.Scanner;
class OddFactorialThread extends Thread {
    int lower, upper;
    OddFactorialThread(int l, int u) {
        lower = l;
        upper = u;
    }
    long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public void run() {
        System.out.println("\n--- Odd Number Factorials ---");
        for (int i = lower; i <= upper; i++) {
            if (i % 2 != 0) {
                System.out.println("Factorial of " + i + " = " + factorial(i));
            }
        }
    }
}
class MultiplesThread extends Thread {
    int lower, upper;

    MultiplesThread(int l, int u) {
        lower = l;
        upper = u;
    }
    public void run() {
        System.out.println("\n--- First 5 Multiples ---");
        for (int i = lower; i <= upper; i++) {
            System.out.print("Multiples of " + i + ": ");
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
public class MultiTaskProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit for odd factorial: ");
        int l1 = sc.nextInt();
        System.out.print("Enter upper limit for odd factorial: ");
        int u1 = sc.nextInt();
        System.out.print("Enter lower limit for multiples: ");
        int l2 = sc.nextInt();
        System.out.print("Enter upper limit for multiples: ");
        int u2 = sc.nextInt();
        OddFactorialThread t1 = new OddFactorialThread(l1, u1);
        MultiplesThread t2 = new MultiplesThread(l2, u2);
        t1.start();
        t2.start();
        sc.close();
    }
}