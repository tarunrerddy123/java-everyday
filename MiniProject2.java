import java.util.*;
public class MiniProject2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Num:");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Num:");
        int num2 = scan.nextInt();
        System.out.print("Enter the Operator(+,-,*,/):");
        char operator = scan.next().charAt(0);
        switch(operator){
            case '+':
                System.out.print("Addition:"+(num1+num2));
                break;
            case '-':
                System.out.print("Subtraction:"+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication:"+(num1*num2));
                break;
            case'/':
                if(num2==0) {
                    System.out.println("Division Is Not Posiible");
                }
                    else{
                        System.out.print("Divison:"+(num1/num2));
                    }
                    break;

        default:
            System.out.println("Enter The Valid Values");
        }
    }

    }

