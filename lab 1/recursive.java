
class recursive {
    void count(int n,int i,int mul){
        if(i<=n){
            int table=mul*i;
            System.out.println(table);
            count(n,i+1,mul);
        }
    }
    public static void main(String[] args){
        recursive obj= new recursive();
        obj.count(10,1,2);
    }
}