import java.util.Scanner;

public class Palindrome {

    static void checkPalindrome(String str) {

        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        checkPalindrome(str);
    }
} 
    

