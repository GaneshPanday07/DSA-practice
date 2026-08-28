import java.util.Scanner;

public class FrequencyofEachCharacter {
    static void frequency(String str){

        boolean[] visited = new boolean[str.length()];
        for(int i = 0; i < str.length(); i++){
            if(visited[i]){
                continue;
            }

            char ch = str.charAt(i);
            int count = 0;

            for(int j=i; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + "->" + count);
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        frequency(str);

    }
}
