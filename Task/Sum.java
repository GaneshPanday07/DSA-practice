import java.util.Scanner;

public class Sum {
    static int sum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int sum = sum(a);
        System.out.println("Sum of array = " + sum);

        sc.close();
    }
}
