public class example05Java {
    public static void main(String[] args) {
        int a=16;
        if(a>10 && a%2==0){
            System.out.println("Statement 1 is OK.");
        }
        else if(a<10 || a%2==0){
            System.out.println("Statement 2 is OK.");
        }
        else if(!(a%2!=0)){
            System.out.println("Statement 3 is OK.");
        }
        else if(a<10 && a%2==0){
            System.out.println("Statement 4 is OK.");
        }
        else if(a<10 || a%2==0 || a==16 || a!=8){
            System.out.println("Statement 5 is OK.");
        }
    }
}
