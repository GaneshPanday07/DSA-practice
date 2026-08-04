import java.util.*;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100){
            System.out.println("invalid marks.");
        }else if(marks >= 90){
            System.out.print("Grade 'A'");
        }else if(marks >= 80){
            System.out.println("Grade 'B' ");
        }else if(marks >= 70){
            System.out.println("Grade 'C' ");
        }else if(marks >= 60){
            System.out.println("Grade 'D' ");
        }else {
            System.out.println("Fail");
        }
    }
}
