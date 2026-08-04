import java.util.*;
public class StudentDetails {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String Student_name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter School name: ");
        sc.nextLine();
        String School_Name = sc.nextLine();

        System.out.println();
        System.out.printf("Student_Name is %s.\nhe is %d years old.\nhe is study in %s.",Student_name,age,School_Name);


    }
}
