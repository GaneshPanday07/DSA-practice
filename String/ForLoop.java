import java.util.Scanner;

public class ForLoop {
    static void forLoop(String name){
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        forLoop(name);
    }
}
