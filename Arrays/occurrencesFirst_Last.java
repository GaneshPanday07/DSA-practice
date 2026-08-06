import java.util.Scanner;

public class occurrencesFirst_Last {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elemrnt to search: ");
        int x = sc.nextInt();
 
        int first = -1;
        int last = -1;

        for(int i = 0; i < n; i++){
            if(a[i] == x){
                
                if(first == -1){
                first = i;
                }
                last = i;
            }
        }
    
        if(first == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("First occurrencce = "+ first);
            System.out.print("Last occurrencce = "+ last);
        }
    }
}
