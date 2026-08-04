
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        int original = number;

        int digits = 0;
        int temp = number;
        while(temp > 0){
            digits++;
            temp /= 10;
        }

        int sum = 0;

        while(number > 0){
            int rem = number % 10;
            sum = sum + (int)Math.pow(rem, digits);
            number /= 10;
        }
        
        if(original == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not armstrong number");
        }

    }
}
