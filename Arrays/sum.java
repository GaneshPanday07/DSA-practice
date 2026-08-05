
import java.util.*;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.print("Enter thr array n element: ");

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            a[i]= sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("sum of all array element: "+sum);

    }
}
