import java.util.*;

public class DuplicateElements {
    static void duplicate(int[] a){

        System.out.println("duplicte elements in This array:");
        for(int i = 0; i < a.length; i++){

            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    System.out.print(a[i]+ " ");
                }
            }
        }
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        duplicate(a);

        sc.close();
    }
}
