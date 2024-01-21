import java.util.Scanner;

public class P36_search {
    public static void main(String[]  args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter rows : ");
        int row = sc.nextInt();
        System.out.print("enter columns : ");
        int col = sc.nextInt();

        int serch[][] = new int[row][col];

        //input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("[" + i + "][" + j + "]=");
                serch[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter serach element : ");
        int srh = sc.nextInt();
        //outputs
        System.out.println("matrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(serch[i][j] + "\t");
            }
            System.out.println();
        }

       
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(serch[i][j] == srh){
                    System.out.println("element found at "+i+"th row and "+j+"th column");
                }
            }
        }
    }
}
