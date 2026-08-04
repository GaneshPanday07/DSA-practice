import java.util.*;
public class Checknum {
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("number is Negitive");
        }else{
            System.out.println("Positive");
        }

    }
}