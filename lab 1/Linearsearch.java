public class Linearsearch {
    public static void main(String[] args) {
       int arr[]={1,2,34,4,5,6,7,8,9};
       int target=2;
       boolean flag=false;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==target)
        {
            System.out.println("Element found at index "+i+" index");
            flag=true;  
        break;
     }
       }
       if(!flag)
       {
        System.out.println("Element not found");
       }
    }
}
