public class matrix {
    public static void main(String[]args){
        int rows,coln;
        int a[][]={
            { 2,3,4},
            {3,5,5},
            {2,3,5}
        };
        int b[][]={{12,2,4},
        {9,3,5},
        {8,5,9}
    };
    //Calculate no.of rows and columns present in given matrix
    rows=a.length;
    coln=a[0].length;
    int c[][]= new int[rows][coln];
    //Now perform the addition of matrix a and b and store in c result
    for(int i=0;i<rows;i++){
        for(int j=0;j<coln;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("Addition of two matrix:");
    for(int i=0;i<rows;i++){
for(int j=0;j<coln;j++){
    System.out.println(c[i][j]+"");}
    System.out.println();
}
         
    }
    
}
