import java.util.Scanner;
public class javainput {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first value: ");
    int a = sc.nextInt();
    System.out.print("Enter second value: ");
    int b = sc.nextInt();

    System.out.println("addition: " + (a+b));

    sc.nextLine();
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter your city: ");
    String city = sc.nextLine();
    
    
    System.out.println();
    System.out.printf("my name is %s.\n i am %d years old.\n i live in %s.", name, age, city);

    }   
}
