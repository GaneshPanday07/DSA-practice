import java.util.Scanner;

public class Reverse {
    static void reverse(String n){
        for(int i = n.length()-1; i >= 0; i--){
            System.out.println(n.charAt(i));
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = sc.nextLine();

        reverse(n);
    } 
}
