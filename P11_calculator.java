import java.util.*;
public class P11_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a : ");
        int a = sc.nextInt();
        System.out.print("enter value of b : ");
        int b = sc.nextInt();
        System.out.print("enter operator : ");
        char op = sc.next().charAt(0);

        switch(op)
        {
            case('+'):
                System.out.print("addition : ");
                System.out.println(a + b);
                break;
            case('-'):
                System.out.print("subtraction : ");
                System.out.println(a - b);
                break;
            case('*'):
                System.out.print("multiplication : ");
                System.out.println(a * b);
                break;
            case('/'):
                System.out.print("division : ");
                System.out.println(a / b);
                break;
            case('%'):
                System.out.print("remainder : ");
                System.out.println(a % b);
                break;
            default:
                System.out.println("operator not match");
        }
    }
}
