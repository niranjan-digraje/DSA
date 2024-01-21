import java.util.Scanner;

public class P30_gcd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();

        while(a!=b)
        {
            if(a>b){
                a = a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("gcd is : "+b);
    }
}
