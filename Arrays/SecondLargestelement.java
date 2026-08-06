import java.util.*;
public class SecondLargestelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter limit of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int l,s;
        if(a[0] > a[1]){
            l = a[0];
            s = a[1];
        }else{
            l = a[1];
            s = a[0];
        }

        for(int i = 0; i < n; i++){
            if(a[i] > s && a[i] != l){
                s = a[i];
            }
        }
        System.out.print(s);
    }
}
