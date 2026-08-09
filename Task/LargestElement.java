import java.util.*;
public class LargestElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int large = a[0];
        for(int i = 0; i<n-1; i++){
            if(a[i] < a[i+1]){
                large = a[i+1];
            }
        }

        System.out.print("Largest Element in array = "+ large);
        
    }
}