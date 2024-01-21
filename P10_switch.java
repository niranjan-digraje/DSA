import java.util.*;

public class P10_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of button : ");
        int button = sc.nextInt();

        switch (button) {
            case (1):
                System.out.println("Hello");
                break;
            case (2):
                System.out.println("Namaste");
                break;
            case (3):
                System.out.println("Jay jinedra");
                break;
            default:
                System.out.println("button not match");
                break;
        }
    }
}
