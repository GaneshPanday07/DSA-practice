import java.util.*;
public class Largestnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a+",is largest number.");
        }else if(a == b){
            System.out.println("Both numbers are equal.");
        }else{
            System.out.println(b+", is largest number.");
        }
        
    }
}
