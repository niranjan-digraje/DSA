import java.util.*;

public class P9_grater_less {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value a : ");
        int a = sc.nextInt();
        System.out.print("enter second value b : ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is grater than b");
        }
    }
}
