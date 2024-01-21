import java.util.*;

public class P28_power {

    public static int power(int a , int b){
        int pw = 1;

        for(int i=1;i<=b;i++){
            pw = pw * a;
        }
        System.out.println("value of "+a+" to the power "+b+" is :" +pw);

        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int a = sc.nextInt();
        System.out.print("enter power : ");
        int b = sc.nextInt();

        power(a, b);
    }
}
