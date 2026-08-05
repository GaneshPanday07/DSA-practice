import java.util.*;
public class Average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter array elements: ");

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            a[i]= sc.nextInt();
            sum += a[i];
        }

        float avg = sum/a.length;
        System.out.println("avrage of array: "+avg);
        
    }
}
