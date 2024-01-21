import java.util.*;

public class P46_powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number : ");
        int n = sc.nextInt();

        if((n&n-1)==0){
            System.out.println("given number is power of 2");
        }
        else{
            System.out.println("given number is not power of 2");
        }
    }
}
