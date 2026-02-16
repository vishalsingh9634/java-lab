public class statvarblock {
    static int number;
    static String message;

    // Static block to initialize static variables
    static {
        number = 100;
        message = "Static variables initialized using static block";
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {

        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }
}
