import java.util.*;
public class Add {
     public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("enter second value: ");
        int b = sc.nextInt();

        System.out.println("addition : " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("multiplication : " + (a*b));
        System.out.println("divide : " + (a/b));
        System.out.println("module : " + (a%b)); 


     }
}