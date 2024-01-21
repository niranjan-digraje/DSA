import java.util.Scanner;

public class P39_strings {
    public  static void main(String[] args){
        //string declaration
        String name = "Niranjan";
        String fullname = "Niranjan Shantinath Digraje";
        // System.out.println(name);
        // System.out.println(fullname);

        //input
        // Scanner sc =new Scanner(System.in);
        // String name = sc.next();
        // String fullname = sc.nextLine();
        // System.out.println("your name is : "+name);
        // System.out.println("your full name is : "+fullname);

        //concatination of strings
        // String fname = "niranjan";
        // String lname ="digraje";
        // String fullname = fname +" "+ lname;
        // System.out.println(fullname);
        // System.out.println(fullname.length());

        //charat
        // for(int i=0;i<fullname.length();i++){
        //     System.out.println(fullname.charAt(i));
        // }

        //compare
        // String name1 = "nitin";
        // //s1 > s2 : return +ve value
        // //s1 = s2  :  return 0
        // //s1 < s2 :  return -ve value
        // if(name.compareTo(name1) == 0){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings are not equal");
        // }

        //sub strings
        // String sub  = fullname.substring(0,2);
        // System.out.println(sub);

        //parse int method of integer class
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        //tostring method of string class
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str);
        System.out.println(str.length());
    }
}
