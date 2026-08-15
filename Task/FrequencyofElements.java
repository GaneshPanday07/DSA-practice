import java.util.*;
public class FrequencyofElements {
    static void frequency(int[] a){

        boolean[] visited = new boolean[a.length];
        System.out.println("frequency elements:");
        for(int i = 0; i < a.length; i++){
            if(visited[i]){
            continue;
        }
            int count = 1;
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    count++;
                    visited[j] = true;

                }
            }
            System.out.println(a[i] + " -> " + count);
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

        frequency(a);

        sc.close();
    }
}
