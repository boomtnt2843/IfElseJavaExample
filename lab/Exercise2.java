package lab;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Input your budget : ");
        Scanner txt = new Scanner(System.in);
        int budget = txt.nextInt();
        if(budget < 0){
            System.out.print("Negative number is not allowed");
        }
        else if(budget >= 0 && budget <= 500){
            System.out.print("you can buy a Keyboard.");
        }else if(budget <= 1000){
            System.out.print("you can buy a Mouse.");
        }else if(budget <= 2000){
            System.out.print("you can buy a Router.");
        }else if(budget <= 10000){
            System.out.print("you can buy a Monitor.");
        }else if(budget > 10000){
            System.out.print("you can buy a Graphic Card.");
        }
    }
}
