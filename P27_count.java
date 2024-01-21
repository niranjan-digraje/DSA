import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class P27_count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number you want to count : ");
        int num = sc.nextInt();

        int pos = 0;
        int neg = 0;
        int zero = 0;

        for(int i=1;i<=num;i++){
            System.out.print("enter "+ i+" number  : ");
            int a = sc.nextInt();

            if(a>0){
                pos++;
            }
            else if(a<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("positive number  is  : "+pos);
        System.out.println("neegative number is : "+neg);
        System.out.println("number of  zeroo is : "+zero);
    }
}