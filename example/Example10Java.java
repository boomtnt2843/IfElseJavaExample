package example;
import java.util.Scanner;

public class Example10Java {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("SWITCH CASE GAME");
        System.out.println("Select your mode");
        System.out.println("1 : play game");
        System.out.println("2 : setting game");
        System.out.println("3 : exit game T_T");
        System.out.print("Select Mode: ");
        Scanner txt = new Scanner(System.in);
        int mode = txt.nextInt();
        System.out.println();
        switch(mode){
            case 1:
                System.out.println("Wow! This game is very fun.");
                System.out.println("Good luck");
                break;
            case 2:
                System.out.println("This is setting game.");
                break;
            case 3:
                System.out.println("See you agian BYE!!! T_T");
                break;
            default:
                System.out.println("What?");
        }
        System.out.println();
    }
}
