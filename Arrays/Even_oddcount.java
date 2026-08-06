import java.util.*;
public class Even_oddcount {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of array: ");
        int n = sc.nextInt();
        
        int a[] = new int[n];
        System.out.print("Enter the elements of array : ");

        int even = 0;
        int odd = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Even numbers = "+ even);
        System.out.println("odd numbers = "+ odd);
    }
}
