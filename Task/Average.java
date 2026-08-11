import java.util.*;

public class Average {

    static double average(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        double average = (double)sum/a.length;
        return average;
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

        double average = average(a);
        System.out.println("Average of array = " + average);

        sc.close();
    }
}


