import java.util.*;
public class P76_hashset {
    public static void main(String[] args) {
        //creating hashset
        HashSet<Integer> set = new HashSet<>();

        //add element in hash set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //print the set
        System.out.println(set);

        //print size of hashset
        System.out.println("size of set is : "+set.size());

        //search element in hashset
        if(set.contains(3)){
            System.out.println("Element is  found");
        }
        else{
            System.out.println("Element is not found");
        }

        //delete element from hashset
        set.remove(2);
        System.out.println(set);

        //iteration of element
        System.out.print("iteration of element : ");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +", ");
        }
        System.out.println();

        //cheack set is empty or not
        if(set.isEmpty()){
            System.out.println("set is empty");
        }
        else{
            System.out.println("set is  not empty");
        }
    }
}
