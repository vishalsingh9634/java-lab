import java.util.*;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        System.out.println("Enter 3 numbers:");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Ascending order:"+arr[0]+" "+arr[1]+" "+arr[2]);
        sc.close();
    }
}
