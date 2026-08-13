import java.util.Scanner;

public class RotateArray {
    static void Reverse(int[] a){

        int last = a.length-1;
    for(int i = 0; i < a.length/2; i++){
        int temp = a[i];
        a[i] = a[last];
        a[last] = temp;
        last--;
    }
        
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Reverse(a);

        System.out.println("Reverse array");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
