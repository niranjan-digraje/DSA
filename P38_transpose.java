import java.util.Scanner;

public class P38_transpose {
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.print("enter rows : ");
        int row = sc.nextInt();
        System.out.print("enter columns : ");
        int  col  = sc.nextInt();

        int spi[][]  = new int[row][col];

        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("["+i+"]["+j+"]=");
                spi[i][j] = sc.nextInt();
            }
        }

         //outputs
        System.out.println("matrix before transpose is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(spi[i][j] + "\t");
            }
            System.out.println();
        }

        //outputs
        System.out.println("matrix after transpose is : ");
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                System.out.print(spi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
