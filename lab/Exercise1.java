package lab;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Input your budget : ");
        Scanner txt = new Scanner(System.in);
        int budget = txt.nextInt();
        if(budget > 15000){
            System.out.print("you can buy it.");
        }
    }
}
