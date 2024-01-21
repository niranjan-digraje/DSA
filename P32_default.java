import java.util.Scanner;

public class P32_default {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);

        int size = sc.nextInt();
        int marks[] = new int[size];

        //input array
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }


        //output array
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
