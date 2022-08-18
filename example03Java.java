import java.util.Scanner;

public class example03Java {
    public static void main(String[] args) {
        System.out.print("Input number1: ");
        Scanner txt = new Scanner(System.in);
        int a = txt.nextInt();

        System.out.print("Input number2: ");
        txt = new Scanner(System.in);
        int b = txt.nextInt();

        if(a>b)
        System.out.println("a>b");
        else if(a<b)
        System.out.println("a<b");
        else
        System.out.println("a=b");
    }
}
