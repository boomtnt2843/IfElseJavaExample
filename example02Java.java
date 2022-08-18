import java.util.Scanner;;

public class example02Java {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner txt = new Scanner(System.in);
        int number = txt.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is even number.");
        }
        else{
            System.out.println(number + " is odd number.");
        }
    }
}
