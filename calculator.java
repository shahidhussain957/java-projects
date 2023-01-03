import java.util.*;
public class calculator {
    public static void main(String[]args){
        int a,b;
        char operator;
        System.out.println("Enter two value for arithmatic process:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        a=sc.nextInt();      //Taking two Integer from user.
        System.out.println("Enter value of b:");
        b=sc.nextInt();      //Taking two Integer from user.
        System.out.println("Enter the Operator whom want to perform the operation:");
        operator=sc.next().charAt(0);//taking operator from user whom arithmatic operation want to perform.
        double addition=a+b;//Here define arithmatic operation.
        double subtraction=a-b;
        double multiplication=a*b;
        double divide=a/b;
        double module= a%b;
        //using swithc case
        switch (operator) {
            case '+':
            System.out.println("Addition:"+addition);
                
                break;
            case '-':
                    System.out.println("Subtraction:"+subtraction);
                     break;
            case '*':
            System.out.println("Multiplication: " +multiplication);
            break;
            case'/':
            System.out.println("divide:"+divide);
            break;
            case '%':
            System.out.println(" Module " +module);
            break;

            default:
            System.out.println("Error:");
                break;
        }
    }
}
