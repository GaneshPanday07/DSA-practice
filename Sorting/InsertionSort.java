import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter arrays elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 1; i< n; i++){

            int key = a[i];//3,4,2,1,4
            int j = i-1;

            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }

            a[j+1]= key;

        }

        System.out.println("Insertion Sort");
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }
}
