import java.util.*;
public class copyarraytoanother {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n; i++){
            a[i]= sc.nextInt();
        }

        int b[] = new int[n];
        System.out.println("print copy array");
        for(int i = 0; i < n; i++){
            b[i] = a[i];
        }

        System.out.println("copy array.");
        for(int i = 0 ; i < n; i++){
            System.out.print(b[i]);
        }

    }
}
