import java.util.*;
public class Array {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int column=sc.nextInt();
    int number[][]=new int[rows][column];
    //input
    //rows
    for(int i=0;i<rows;i++){
        //columns
        for(int j=0;j<column;j++){
            number[i][j]=sc.nextInt();
        }
    } 
    //Output
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            System.out.println(number[i][j]);
        }
        System.out.println();
    }  
    }
}
