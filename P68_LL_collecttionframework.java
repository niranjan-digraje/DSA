import java.util.*;
public class P68_LL_collecttionframework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //add
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);

        //deelete
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        //size
        int s = list.size();
        System.out.println(s);

        //get  or iterate element
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        } 
        System.out.println("null");
    }
}
