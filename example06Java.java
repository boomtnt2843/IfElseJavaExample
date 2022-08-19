import java.util.Scanner;

public class Example06Java {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner txt = new Scanner(System.in);
        int number = txt.nextInt();
        String oddOrEven = (number % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(number + " is " + oddOrEven + " number.");         
    }
}
