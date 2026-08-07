import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int j = 0; j < n-1; j++){

            boolean swapped = false;
        for(int i = 0; i < n-1-j; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;

                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
    }

        System.out.println("Bubble sort");
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
        

        sc.close();
    }
}
