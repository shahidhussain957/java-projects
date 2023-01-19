import java.util.Scanner;
import java.util.*;
public class Array4{
    public static void main(String args[]){
    int arr[]={10,12,20,15,20,21,23,25,30,37};
    System.out.println("Enter number :");
    Scanner scan=new Scanner(System.in);
    int target=scan.nextInt();//Taking number from user .
    System.out.println("The number"+target+"found at:"+Linear(arr, target));//Calling method.
    }
    public static int Linear(int num[],int target){
        if(num.length==0){
            return -1;
        }
        System.out.println("If number not found then it will shows [-1]");
        for(int index=0;index<num.length;index++){
            int element=num[index];
            if(element==target){
                return index;
            }
        
    }
    return-1;
    }
}