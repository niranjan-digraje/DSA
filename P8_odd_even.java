import java.util.*;
public class P8_odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number :");
        int num = sc.nextInt();
        
        if((num % 2) == 0)
        {
            System.out.println("given number is even");
        }
        else
        {
            System.out.println("given number is odd");
        }
    }
}
