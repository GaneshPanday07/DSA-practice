//Count how many numbers are between 1 and N
import java.util.*;
public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int i = 1;
        for(i=2; i<n; i++){
            count++;
        }
        System.out.println(count);
    }
}
