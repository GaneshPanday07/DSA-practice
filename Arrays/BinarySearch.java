import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array limit:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key element for search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n-1;
        boolean found = false;

        while(low <= high){

            int mid = (low+high)/2;

            if(key == a[mid]){
                System.out.println("Element found at index: "+mid);
                found = true;
                break;
            }else if(key < a[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        if(!found){
            System.out.println("Not found");
        }
        
        sc.close();
    
    }

}
