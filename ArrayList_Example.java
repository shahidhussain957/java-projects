import java.util.ArrayList;
//import java.util.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList_Example{
    public static void main(String args[]){
       
        // System.out.println("Enter size of ArrayList:");
        // int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(5);

        // Add elements using add() operation.

        list.add(550);
        list.add(505);
        list.add(5);
        list.add(55);
        list.add(585);
        list.add(525);
        list.add(50);
        System.out.println(list);

        //Set element using set() operation. at index 1 to 600.

        list.set(1,600);//changing value at 1 index using set.
        System.out.println(list);

        //Checking the number is present in list using contain().
        System.out.println(list.contains(55));

        //Getting element at index 3 using get().
        System.out.println(list.get(3));

        //Delete elements from arraylist        
        System.out.println(list.remove(3));

        //Sorting of an arraylist in ascending order
        Collections.sort(list);
        System.out.println(list);
        
        //Taking size of an arraylist from user.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of ArrayList:");
        int n=in.nextInt();
        ArrayList<Integer> list1=new ArrayList<>(n);

        System.out.println("Enter values:");
        for(int i=0;i<n;i++){//Taking number from user. 
            list1.add(in.nextInt());
        }
        for(int i=0;i<n;i++){//get item at any index.
                System.out.println(list1.get(i));//Pass index her, list[index] not working here.
        }
        System.out.println(list1);

    }
}