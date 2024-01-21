import java.util.Scanner;

public class P45_bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get bit
        // int n=5;  //0101
        // int pos=2;
        // int bitmask = 1<<pos;
        
        // if((bitmask & n)==0){
        //     System.out.println("bit was zero");
        // }
        // else{
        //     System.out.println("bit was one");
        // }

        //set bit
        // int n=5; //0101
        // int pos=1;
        // int bitmask = 1<<pos;

        // int newnum = bitmask | n;
        // System.out.println("new number is : "+newnum);

        //clear bit
        // int n=5;
        // int pos=2;
        // int bitmask = 1<<pos;

        // int newnum =  ~(bitmask) & n;
        // System.out.println("new number  is : "+newnum);

        //update bit
        int n=5;
        int pos=1;
        int bitmask = 1<<pos;
        
        System.out.print("enter update bit:");
        int update =sc.nextInt();

        if(update == 1){
            //set bit operation
            int newnum = bitmask | n;
            System.out.println("new number is : "+newnum);
        }
        else if(update == 0){
            //clear bit opertion
            int newnum =  ~(bitmask) & n;
            System.out.println("new number  is : "+newnum);
        }
    }
}
