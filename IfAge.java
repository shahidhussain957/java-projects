import java.util.*;

public class IfAge {
    public static void main(String[]args){
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);//getting number from user 
        int age=sc.nextInt();//taking user input number by using scanner class
        System.out.println("The age you entered:"+age);
        if(age>=18){//applying condtion if the age greater than equal to 18 then print "Adult".
            System.out.println("You are adult");
        }
        else{//if the age not greater than equal to 18 then print "Not Adult"
            System.out.println("You are not adult");
        }

        // Program check whether the number is Even Or Odd

        System.out.println("Entered a number check whether it is Even or Odd");
        Scanner pc=new Scanner(System.in);
        int num=pc.nextInt();//Taking a number from user
        System.out.println("The number you entered is: "+num);
        if(num%2==0){//checking condtion if the reminder gives 0 then it will print Even
            System.out.println("It is Even number");
        }
        else{//If the given condition no give reminder then the else block will execute
            System.out.println("It is Odd");
        }
        
    }
    
}
