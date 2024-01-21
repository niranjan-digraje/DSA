public class P65_quicksort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // partition
    public static int partition(int arr[], int low, int high) {
        int pivote = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivote) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivote;
        arr[high] = temp;
        return i; // pivote index
    }

    // sort
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivote = partition(arr, low, high);
            quicksort(arr, low, pivote - 1);
            quicksort(arr, pivote + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quicksort(arr, 0, n - 1);
        print(arr);

    }
}
