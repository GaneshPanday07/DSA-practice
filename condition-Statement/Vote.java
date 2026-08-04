import java.util.*;
public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int Age = sc.nextInt();
        
        boolean voterId = true;
        if(Age >= 18){
            if(voterId){
                System.out.println("Can Vote");
            }else{
                System.out.println("Can't vote");
            }
        }else {
            System.out.print("you are teenager. please wait for 18+.");
        }
        
    }
}
