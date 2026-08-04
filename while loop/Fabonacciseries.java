
public class Fabonacciseries {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int i = 1;

        while(i <= 10){
            System.out.println(a);
            int temp = a+b;
            a = b;
            b = temp;
            i++;
        }
    }
}
