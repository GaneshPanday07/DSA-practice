import java.util.*;
public class occurrencesCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");  
        int x = sc.nextInt();

        int count = 0;

        for(int j = 0; j<n; j++){
            if(a[j] == x){
                count++;
            }
        }

        System.out.println(x + " occurs " + count + "times");
    }

}
