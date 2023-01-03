import java.util.*;
public class menuDriven{
    public static void main(String[]args){
        Scanner pc=new Scanner(System.in);//Declaring scanner class for taking number from user.
        System.out.println("Enter marks of students;");
        int input;//Declaring input if the user want to execute program further by entering (1) and terminate by entering (0) input use in condition for yes or no.
        do{
            int marks=pc.nextInt();                //Here we are taking students marks from user.
            if(marks>=90 && marks<=100){          //If the marks greater than 90 and less than 100 then print "excellent".
                System.out.println("This is excellent:");
            }
            else if(marks>=60 && marks <=89){       //If the marks greater than 60 and less than 89 then print "good"
                System.out.println("This also good:");
            }
            else if(marks>=0 && marks<=59){             //If the marks greater than 0 and less than 59 the print "Poor"
                System.out.println("This is poor:");
            }
            else{
                System.out.println("Invalid numbers:");
            }
            System.out.println("Want to continue? press if yes(1) if no press (0)");
            input=pc.nextInt();         //Taking the value "0" either "1" to execute program further or terminate.
        }while(input==1); //If the user enter "1" the program executer further. If the user enter "0" the program terminate.
    }
}