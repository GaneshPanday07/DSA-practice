import java.util.*;
public class CheckLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three num:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println("All number are equals.");
        }else if(a>b && a>c){
            System.out.println(a+", is largest number.");
        }else if(b > c){
            System.out.println(b+", is largest number.");
        }else{
            System.out.println(c+", is largest number.");
        }
    }
}
