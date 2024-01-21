import java.util.Scanner;

public class P22_functions {
    //function declaration
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.next();
        System.out.print("your name is : ");

        //function calling
        printMyName(name);
    }
}
