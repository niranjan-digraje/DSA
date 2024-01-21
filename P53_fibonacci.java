import java.util.Scanner;

public class P53_fibonacci {
    
    public static int fibonacci(int n1,int n2,int num){
        int n3 = n1+n2;
        //int n4 = num;
        System.out.print(n3 +"\t");
        if(n3==num){
            return 0;
        }
        n1 = n2;
        n2=n3;
        int fib = fibonacci(n1,n2,num);
        return fib;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  number : ");
        int num = sc.nextInt();
        int n1 = 0;
        int  n2= 1;
        //int n3;
        System.out.print(n1+"\t"+n2+"\t");
        fibonacci(n1,n2,num);
    } 
}
