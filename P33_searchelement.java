import java.util.Scanner;

public class P33_searchelement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int num[] = new int[size];

        System.out.println("enter element in array : ");
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        System.out.print("enter element for searching : ");
        int element = sc.nextInt();

        for(int i=0;i<size;i++){
            if(num[i] == element){
                System.out.println("element found at index : "+i);
            }
        }

    }
}
