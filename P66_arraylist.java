import java.util.ArrayList;
import java.util.Collections;

 //import java.util.*;    //for all packages
public class P66_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        //ArrayList<String>list2 = new ArrayList<String>();

        //add element
        list1.add(0);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);

        //get element
        int element = list1.get(0);
        System.out.println(element);

        //add element in between
        list1.add(1,5);
        System.out.println(list1);

        //set element
        list1.set(0,7);
        System.out.println(list1);

        //delete element
        list1.remove(2);
        System.out.println(list1);

        //size of arraylist
        int size = list1.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println(list1);

    }
}
