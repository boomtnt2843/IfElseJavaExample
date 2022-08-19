package lab;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        int a = txt.nextInt();
        System.out.print("Input number 2 : ");
        int b = txt.nextInt();
        System.out.print("Input operator : ");
        char operator = txt.next().charAt(0);
        switch(operator){
            case '+':
                System.out.print(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.print(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.print(a + " * " + b + " = " + (a*b));
                break;    
            case '%':
                System.out.print(a + " % " + b + " = " + (a%b));
                break;
        }
    }  
}
