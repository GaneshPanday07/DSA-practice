import java.util.*;
public class largest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i =0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int l = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > l){
                l = a[i];
            }
        }

        System.out.println("the largest number in array = "+ l);
    }
}
