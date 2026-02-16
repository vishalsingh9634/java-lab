public class q28 {
     static String collegeName = "GLA University";

    static void showDetails() {
        System.out.println("College Name: " + collegeName);
    }

public static void main(String[] args) {

        System.out.println("Accessing Static Variable:");
        System.out.println(q28.collegeName);

        System.out.println();

        System.out.println("Accessing Static Method:");
        q28.showDetails();
    }



}


    