import java.util.Scanner;

public class P24_factorial {

    public static int factorial(int a){
        int fact = 1 ;
        for(int i =a;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return 1;
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("enter number : ");
        num = sc.nextInt();
        System.out.print("factorial of number is : ");
        factorial(num);
    }
}
