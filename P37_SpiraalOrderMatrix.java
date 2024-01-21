import java.util.Scanner;

public class P37_SpiraalOrderMatrix {
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
        System.out.println("matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(spi[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("tthe spiral order matrix is : ");
        int rstart  = 0;
        int rend  = row-1;
        int cstart  = 0;
        int cend = col-1;

        while(rstart <=rend &&  cstart<=cend){
            for(int j=cstart;j<=cend;j++){
                System.out.print(spi[rstart][j]+"\t");
            }
            rstart++;

            for(int i=rstart;i<=rend;i++){
                System.out.print(spi[i][cend]+"\t");
            }
            cend--;

            for(int j=cend;j>=cstart;j--){
                System.out.print(spi[rend][j]+"\t");
            }
            rend--;

            for(int i=cend;i>=rstart;i--){
                System.out.print(spi[i][cstart]+"\t");
            }
            cstart++;
        }
    }
}
