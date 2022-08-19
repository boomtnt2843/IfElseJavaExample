package example;
import java.util.Scanner;

public class Example08Java {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner txt = new Scanner(System.in);
        int age = txt.nextInt();
        String textAge = (age<=18) ? "Young" : (age <= 45) ? "Adult": "Elder";
        System.out.println(textAge);         
    }
}
