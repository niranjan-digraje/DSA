import java.util.*;
public class P80_union {
    public static void union(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<Integer>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for(int i =0;i<n1;i++){   ///arr1
            if(!set.contains(arr1[i])){
               set.add(arr1[i]);
            }
        }

        for(int i=0;i<n2;i++){    //arr2
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        System.out.println(set);

        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,6,2,4};
        union(arr1,arr2);
    }
}
