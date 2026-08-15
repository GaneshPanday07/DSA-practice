import java.util.*;

public class RemoveDuplicateElements {
    static void removeDuplicateElements(int[] a){
        int result[] = new int[a.length];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            
           boolean flag = false;
            for(int j = 0; j < index; j++){
                if(a[i] == result[j]){
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
            result[index]=a[i];
            index++;
            }
        }

        System.out.println("new Array");
        for(int i = 0; i < index; i++){
            System.out.print(result[i] + " ");
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        removeDuplicateElements(a);
    }
}
