import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

        }

        System.out.println("Selected sorting...");
        for(int i = 0; i < n; i++){
            System.out.println(a[i] +" ");
        }

        sc.close();

    }
}