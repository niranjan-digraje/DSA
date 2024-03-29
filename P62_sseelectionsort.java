public class P62_sseelectionsort {
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //sort
        //time complexity = O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[small] > arr[j]){
                    small =j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            
        }

        print(arr);

}
}
