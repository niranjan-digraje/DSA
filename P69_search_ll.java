import java.util.*;
public class P69_search_ll {
    public static void main(String[] args) {
        // LinkedList<String>list = new LinkedList<String>();

        // list.addLast("1");
        // list.addLast("5");
        // list.addLast("7");
        // list.addLast("3");
        // list.addLast("8");
        // list.addLast("2");
        // list.addLast("3");
        // System.out.println(list);

        // for(int i=0;i<list.size();i++){
        //     String num = list.get(i);
        //     if(num == "7"){
        //         System.out.println("index is : "+i);
        //     }
        // }
        LinkedList<Integer>num = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int size = 50;
        for(int i=0;i<size;i++){
            System.out.println("enter element : ");
            int n = sc.nextInt();
            num.addLast(n);
        }
        System.out.println(num);

        for(int j=0;j<size;j++){
            int n = num.get(j);
            if (n >25){
                num.removeLast();
            }
        }
        System.out.println(num);
        

    }
}
