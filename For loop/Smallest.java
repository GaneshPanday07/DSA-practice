import java.util.Scanner;

public class Smallest {
    public static int findSmallest(int[] a){
        int small= a[0];
        for(int i=1; i < a.length; i++){
            if(a[i] < small){
                small = a[i];
            }
        }
        return small;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array Element: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); 
        }

        int result = findSmallest(a);

        System.out.print("Smallest Number: "+ result);

        sc.close();
    }
}
