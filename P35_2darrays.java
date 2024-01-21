import java.util.Scanner;

public class P35_2darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows : ");
        int row = sc.nextInt();
        System.out.print("enter columns : ");
        int col = sc.nextInt();

        int num[][] = new int[row][col];

        System.out.println("enter array element : ");

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("num[" + i + "][" + j + "]=");
                num[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
