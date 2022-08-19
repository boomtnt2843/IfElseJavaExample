package lab;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Input your budget : ");
        Scanner txt = new Scanner(System.in);
        int budget = txt.nextInt();
        String canBuy = new String();
        canBuy = (budget >= 0 && budget <= 500) ? "Keyboard" : (budget <= 1000) ? "Mouse" : (budget <= 2000) ? "Router" : (budget <= 10000) ? "Monitor" : "Graphic Card";
        if(budget >= 0){
            System.out.print("you can buy a " + canBuy + ".");
        }
    }
}
