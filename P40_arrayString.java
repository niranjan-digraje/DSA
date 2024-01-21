import java.util.Scanner;

public class P40_arrayString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        String str[] = new String[size];
        int sum =0;

        //input
        for(int i=0;i<size;i++){
            System.out.print("enter string at position "+i+" : ");
            str[i] = sc.nextLine();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.print(str[i]+" ");
        }

        //length
        for(int i=0;i<size;i++){
            sum = sum + str[i].length();
        }

        System.out.println("total length of string is : "+sum);




    }
}
