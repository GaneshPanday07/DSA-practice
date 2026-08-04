//Print numbers from 1 to 100
public class oneto100 {
    public static void main(String[] args){

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println();
        //Print numbers from 100 to 1

        for(int i = 100; i>=1; i--){
            System.out.println(i);
        }

        System.out.println();
        //Print all even numbers between 1–50
        for(int i=2; i<= 50; i++){
            if(i%2 ==0){ System.out.println(i);}
        }

        System.out.println();
        //Print all odd numbers between 1–50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}



