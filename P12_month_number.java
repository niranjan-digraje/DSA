import java.util.*;

public class P12_month_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter month nuber : ");
        int month = sc.nextInt();

        switch (month) {
            case (1):
                System.out.println("janewary");
                break;
            case (2):
                System.out.println("feburvary");
                break;
            case (3):
                System.out.println("march");
                break;
            case (4):
                System.out.println("april");
                break;
            case (5):
                System.out.println("may");
                break;
            case (6):
                System.out.println("june");
                break;
            case (7):
                System.out.println("jully");
                break;
            case (8):
                System.out.println("augost");
                break;
            case (9):
                System.out.println("saptember");
                break;
            case (10):
                System.out.println("octomber");
                break;
            case (11):
                System.out.println("november");
                break;
            case (12):
                System.out.println("december");
                break;
            default:
                System.out.println("month number not match");
        }
    }
}