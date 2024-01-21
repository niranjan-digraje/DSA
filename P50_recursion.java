public class P50_recursion {
    // 5 to 1
    public static void printnum(int n) {
        if (n > 0) {
            System.out.println(n);
            printnum(n - 1);
        } else {
            return;
        }

    }

    // 1 to 5
    public static void printnum1(int n) {
        if (n <= 5) {
            System.out.println(n);
            printnum1(n + 1);
        } else {
            return;
        }

    }

    public static void main(String[] args) {
        int n = 1;
        // printnum(num);
        printnum1(n);

    }
}
