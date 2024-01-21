import java.util.*;
public class P81_intersection {
    public static void intersection(int arr1[],int arr2[]){
        HashSet<Integer> set2  = new HashSet<>();
        HashSet<Integer> inter  = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for(int i =0;i<n2;i++){
            set2.add(arr2[i]);
        }
        
        for(int j=0;j<n1;j++){
            if(set2.contains(arr1[j])){
                inter.add(arr1[j]);
            }
        }

        System.out.println(inter);

    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        intersection(arr1,arr2);

    }
}
