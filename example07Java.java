import java.util.Scanner;

public class Example07Java {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner txt = new Scanner(System.in);
        float number = txt.nextFloat();
        String OddOrEven = (number % 2 == 0) ? "Even" : (number % 2 == 1) ? "Odd": "float";
        System.out.println(number + " is " + OddOrEven + " number.");         
    }
}
