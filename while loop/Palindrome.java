import java.util.*;
public class Palindrome{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            int orignal = number;

            int rev = 0;
            while (number > 0) {
                int rem = number % 10;
                rev = rev * 10 + rem;
                number /= 10;
            }
            
            if(orignal == rev){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }

        }
}


