import java.util.Scanner;

public class P42_username {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your email id : ");
        String email = sc.next();
        System.out.println("your email id is : "+email);
        String  user = email.substring(0,email.length()-10);
        System.out.println("your username is : "+user);
    }
}
