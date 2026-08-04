import java.util.*;
public class Calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // +=1, -=2, *=3, /=4, %=5.
        int num = sc.nextInt();
       
        switch(num){
            case 1: System.out.print("Addition: "+(a+b));
            break;
            case 2: System.out.println("subtraction: "+(a-b));
            break;
            case 3: System.out.println("multiplication: "+(a*b));
            break;
            case 4: System.out.println("Divide: "+(a/b));
            break;
            case 5: System.out.println("module: "+(a%b));
            break;
            default: System.out.println("undefine");
        }
    }
}
