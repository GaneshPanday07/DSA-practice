import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Reverse array");
        for(int j=n-1; j >= 0; j--){

            System.out.print(a[j]);
        }
    }
}

