import java.util.*;
public class SumOfArray {
    public static void main(String args[]){
        System.out.println("Sum of matrices by user in size of rows and columns:");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int number[][]=new int[rows][col];
        int number1[][]=new int[rows][col];
        int sum[][]=new int[rows][col];
        //Intput of first matrix.
        System.out.println("First matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                number[i][j]=sc.nextInt();
            }
        }
        //Input of second matrix.
        System.out.println("Second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                number1[i][j]=sc.nextInt();
            }
        }
        //Output
        System.out.println("Sum of two matrices is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=number[i][j]+number1[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
