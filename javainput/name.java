import java.util.*;
public class name {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println();
        System.out.printf("my name is %s. and i am %d years old.",name,age);


    }
}
