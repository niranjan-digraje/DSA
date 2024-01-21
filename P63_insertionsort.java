public class P63_insertionsort {
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        //sort
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current < arr[j]){
                //swap
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        print(arr);
    }
}
