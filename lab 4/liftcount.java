
public class liftcount {
    public static void main(String[] args) {
        int arr[]={5,1};
        int curr=0;
        int sum=0;
        for(int i : arr){
            sum+=Math.abs(curr-i);
            curr=i;
        }
        System.out.print(sum);
    }
}
