
public class P51_sumofnaatralnumber {
    
    public static int sum(int i,int n,int sume) {
        
        if(i==n){
            sume = sume+i;
            System.out.println(sume);
        }
        sume = sume +i;
        return sum(i+1,n,sume);
    }
    public static void main(String[] args) {
        int n=5;
        int ans =sum(1,n,0);
        System.out.println(ans);
    }
}
