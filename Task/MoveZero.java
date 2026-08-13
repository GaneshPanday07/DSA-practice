import java.util.*;

public class MoveZero {
    static void moveZero(int[] a){
        int index = 0;
        for(int i = 0; i < a.length; i++){
            
            if(a[i] != 0){
                a[index] = a[i];
                index++;
            }
        }
         while(index < a.length){
                a[index] = 0;
                index++;
            }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        moveZero(a);

        System.out.println("After Move All Zeros:");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
