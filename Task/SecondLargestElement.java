import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int L = a[0];
        int S = a[1];
        if(a[0] < a[1]){
            L = a[1];
            S = a[0];
        }

        for(int i = 2; i < n; i++){
            if(L < a[i]){
                S = L;
                L = a[i];
            }else if(S < a[i] && L != a[i]){
                S = a[i];
            }
        }

        System.out.print("Secondlargest Element = "+ S);

        sc.close();
    }
}
