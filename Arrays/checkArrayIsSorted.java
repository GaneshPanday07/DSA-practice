import java.util.Scanner;

public class checkArrayIsSorted {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array limit: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int flag = 1;
        for(int i = 0; i < n-1; i++){
            if(a[i+1] < a[i]){
                flag = 0;
                break; 
            }
        }

        if(flag == 1){
            System.out.println("an array is sorted.");
        }else{
            System.out.println("Not Sorted.");
        }
    }
}
