import java.util.*;

import javax.lang.model.util.ElementScanner14;

public  class P20_menu_driven_programe{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int  num;
        int marks;

        do{
            System.out.print("enter number 1  or 0 :");
            num = sc.nextInt();

            if(num == 1)
            {
                System.out.print("enter student  marks : ");
                marks = sc.nextInt();

                if(marks >= 90)
                {
                    System.out.println("this is good");
                }
                else if((marks <=89) && (marks >=60))
                {
                    System.out.println("this is also good");
                }
                else{
                    System.out.println("this is good as well");
                }
            }
        }while(num!=0);
    }
}