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
       for(int i = 0; i < n/2; i++){
            int temp = a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
       }

       for(int i = 0; i < n; i++){
        System.out.print(a[i]+" "); 
       }

       sc.close();
    }
}

