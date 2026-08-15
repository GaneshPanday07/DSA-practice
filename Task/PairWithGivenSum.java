import java.util.*;
public class PairWithGivenSum {
    static void pairWithSum(int[] a,int target){

        boolean flag = false;
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a.length; j++){
                if((a[i]+a[j]) == target){
                    System.out.print("pair found ");
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
                }
        }
        if(!flag){
            System.out.print("Not pair found");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array Size:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter Elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter target value : ");
        int target = sc.nextInt();

        pairWithSum(a, target);

        sc.close();
    }
}
