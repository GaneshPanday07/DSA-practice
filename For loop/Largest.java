import java.util.Scanner;

public class Largest {
    public static int findLargest(int[] a){
        int max = a[0];

        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int result = findLargest(a);

        System.out.print("Largest Number: " + result);
        
        sc.close();
    
    }
}
