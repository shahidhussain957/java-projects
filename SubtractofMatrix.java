import java.util.*;
public class SubtractofMatrix {
    public static void main(String args[]){
        System.out.println("Subtraction of two matrices:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int matrix1[][]=new int[rows][col];
        int matrix2[][]=new int[rows][col];
        int sub[][]=new int[rows][col];
        //Input of first matrix.
        System.out.println("First matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        //Input of Second Matrix.
        System.out.println("Second Matrix.");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        //Subtraction of matrices
        System.out.println("Subtraction of matrix1 from matrix2;");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sub[i][j]=matrix2[i][j]-matrix1[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}
