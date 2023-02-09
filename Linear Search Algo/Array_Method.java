import java.util.*;

public class Main {
    
    public static void Sum (int rows, int col, int [][] mat1, int [][] mat2, int [][] sum) {
        
    //Mistake 1:  public static void Sum(int rows[][],int col[][]){
        
        int i, j;
        
        // We have to create an Scanner object here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input of first matrix:");
        
        //Taking input
        
        for(i = 0; i < rows; i++){
            for(j = 0; j < col;j ++){
                mat1[i][j]=input.nextInt();
            }
        }
        //Input of second matrix
        
        System.out.println("input of second matrix:");
        
        for(i = 0; i < rows; i++){
            for(j = 0; j < col; j++){
                mat2[i][j]=input.nextInt();
            }
        }
        
        //Output
        
        System.out.println("Sum of two matrices is: ");
        
        for(i = 0; i < rows; i++){
            for(j = 0; j < col; j++){
                
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        input.close();
    }
    public static void main(String args[]){
        System.out.println("Enter size of rows and columns:");
        
        // Mistake 2: Scanner class object and the three matrices 
        // are created here and cannot be accessed in the sum function
        
        Scanner sc=new Scanner(System.in);
        
        int rows=sc.nextInt();
        
        int col=sc.nextInt();
        
        int matrix1[][] = new int[rows][col];
        
        int matrix2[][] = new int[rows][col];
        
        int sum[][] = new int[rows][col];
        
        // Therefore, you have to pass the matrices in the sum function as well!
        
        Sum(rows, col, matrix1, matrix2, sum);
        
        sc.close();
    }
}
