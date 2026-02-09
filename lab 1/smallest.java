public class smallest {
    public static void main(String[] args) {
    int a=25486;
    int mini=0;
    int max=0;
    while(a>0){
        int rem = a % 10;
        if(rem<mini){
            mini=rem;
        }
        if(rem>max){
            max=rem;
        }
        a /= 10;
    }
     System.out.println("mini"+" : "+mini);
     System.out.println("max"+" : "+max);
    }

}
