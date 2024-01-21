import java.util.Scanner;

public class P26_odd_sum {

    public static int odd(int a){
        int sum =0;
        for(int i=1;i<=a;i++)
        {
            if(i%2 == 1){
                sum =  sum + i;
            }
        }
        System.out.println("sum  of odd number is : "+ sum);
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();

        odd(num);
    }
}
