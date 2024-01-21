import java.util.*;
public class P21_prime__number {
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter  number : ");
        int num = sc.nextInt();
        int  sum = 0;
        for(int  i=2;i<num;i++)
        {
            if((num % i)!= 0){
                
            }
            else{
                sum  = sum + i;
            }
        }

        if(sum == 0)
        {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
