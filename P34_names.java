import java.util.Scanner;

public class P34_names {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.print("enter size of array : ");
        int  size = sc.nextInt();
        String name[] = new String[size];
        
        for(int i=0;i<size;++i){
            System.out.print("enter names : ");
            name[i] = sc.next();
        }

        for(int  i=0;i<size;++i){
            System.out.print("name is : ");
            System.out.println(name[i]);
        }
    }
}
