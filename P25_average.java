import java.util.Scanner;

public class P25_average {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter  first number : ");
        int a = sc.nextInt();

        System.out.print("enter  second number : ");
        int b = sc.nextInt();

        System.out.print("enter  third number : ");
        int c = sc.nextInt();

        int av = (a+b+c)/3;
        System.out.println("average is : "+ av);
    }
}
