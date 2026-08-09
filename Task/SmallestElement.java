import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }

        int smaller = a[0];
        for(int i = 1; i < n; i++){
            if(a[i] < smaller){
                smaller = a[i];
            }
        }

        System.out.print("Smallest Element = "+ smaller);

        sc.close();
    }
    
}
