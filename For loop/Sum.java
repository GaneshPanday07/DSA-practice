//Find the sum of numbers from 1 to N

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);


        //Find the sum of even numbers from 1 to N
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0){ sum += i; }
        }
        System.out.println(sum);


        //Find the sum of odd numbers from 1 to N
        sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    
}
