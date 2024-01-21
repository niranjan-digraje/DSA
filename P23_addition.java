import java.util.Scanner;

public class P23_addition {

    public static int add(int a , int b){
        int sum = a+b;
        System.out.print("your addition is : "+ sum);
    
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("enter first number : ");
        a = sc.nextInt();
        System.out.print("enter second number : ");
        b = sc.nextInt();

        add(a,b);

    }
}
