// Print all prime numbers from 1 to 100

public class primeoneto100 {

    public static void main(String[] args) {

        int i = 2;

        while (i <= 100) {

            int j = 2;
            int flag = 1;

            while (j < i) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                j++;
            }

            if (flag == 1) {
                System.out.println(i);
            }

            i++;
        }
    }
}
