import java.util.Scanner;

public class P29_fibonacciseeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  number : ");
        int num = sc.nextInt();
        int n1 = 0;
        int  n2= 1;
        int n3;
        System.out.print(n1+"\t"+n2+"\t");

        for(int i =2;i<=num;++i){
            n3 = n1+n2;
            System.out.print(n3 +"\t");
            n1  = n2;
            n2=n3;
        }

    }
}
