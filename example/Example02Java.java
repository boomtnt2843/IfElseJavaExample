package example;
import java.util.Scanner;;

public class Example02Java {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner txt = new Scanner(System.in);
        int number = txt.nextInt();
        String oddOrEven = new String();
        if(number % 2 == 0){
            oddOrEven = "even";
        }
        else{
            oddOrEven = "odd";
        }
        System.out.println(number + " is " + oddOrEven + " number.");
    }
}
