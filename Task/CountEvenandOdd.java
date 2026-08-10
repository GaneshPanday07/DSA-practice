import java.util.*;

public class CountEvenandOdd {
    static int countEven(int a[]){
        int even = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                even++;
            }
        }
        return even;  
    }

    static int countOdd(int a[]){
        int odd = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i]%2 != 0){
                odd++;
            }
        }
        return odd;  
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int even = countEven(a);
        System.out.println("Even = "+ even);

        int odd = countOdd(a);
        System.out.println("Odd = "+ odd);
        sc.close();
    }
}
