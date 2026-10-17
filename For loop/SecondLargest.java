import java.util.Scanner;

public class SecondLargest {
    public static int findSecondLargest(int[] a){
        int l,sl;
        if(a[0] > a[1]){
            l=a[0];
            sl=a[1];
        }else{
           l=a[1];
           sl=a[0];
        }

        for(int i=2; i<a.length; i++){
            
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int result = findSecondLargest(a);

        System.out.print("Second-Largest Number: " + );

        sc.close();
    }
}
