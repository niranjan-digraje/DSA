public class P55_xton_logn {
    public static int calcpower(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2 == 0){
            int xpownm1= calcpower(x,n/2);
            int xpown = xpownm1 * xpownm1;
            return xpown;
        }
        else{
            int xpownm1= calcpower(x,n/2);
            int xpown = x* xpownm1 * xpownm1;
            return xpown;
        }
        
        
    }
    public static void main(String[] args) {
        int x=2 , n=4;
        int ans = calcpower(x,n);
        System.out.println(ans);
    }
}
