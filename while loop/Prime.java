public class Prime {
    public static void main(String[] args){
        int n = 11;
        int flag = 1;

        if(n <= 1){
            flag = 0;
        }else{
        int i = 2;
        while(i < n){
            if(n % i == 0){
               flag = 0;
               break;
            }
            i++;
        }}
        if(flag == 1){
            System.out.println("prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
