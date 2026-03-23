/*  we are given transaction where:
positive deposit
negative  withdrawal
we must find maimum balance reached during the day
example-
transaction=[1000,-200,300,-500,700,-100]
transactin     cureent balance max balance
1000            1000        1000
-200            800         1000
300             1100        1100
-500            600         1100
700             1100        1300
-100            1200        1300
*/
public class passbook {
    public static void main(String[] args) {
        int sum=0;
        int a[]={1000,-200,300,-500,700,-100};
        int maxdeposit=a[0];
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            maxdeposit=Math.max(maxdeposit,sum);
        }
        System.out.println(maxdeposit);
    }
}
