import java.util.*;
public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int x = 3;
        int found = 0;
        for(int j = 1; j<n; j++){
            if(a[j] == x){
                found = 1;
                break;
            }
        }

        if(found == 1){
            System.out.print("found the element in array");
        }else{
            System.out.println("Not found element in array.");
        }
    }
}
