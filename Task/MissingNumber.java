import java.util.*;

public class MissingNumber {
    
    static void missingNumber(int[] a,int n){
        int E = (n*(n+1))/2;

        int sum = 0;
        for(int i = 0; i< a.length; i++){
            sum = sum + a[i];
        }

        int actual = E - sum;
        System.out.print("MissingNumber " + actual);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[ n - 1 ];

        System.out.println("Enter elements:");
        for(int i = 0; i < n-1; i++){
            a[i] = sc.nextInt();
        }

        missingNumber(a, n);

        sc.close();

    }
}