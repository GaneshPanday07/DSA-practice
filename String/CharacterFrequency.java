import java.util.Scanner;

public class CharacterFrequency {

    static void frequency(String str) {

        int[] frequency = new int[26];

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            frequency[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++) {

            if(frequency[i] > 0) {

                char ch = (char)(i + 'a');

                System.out.println(ch + " -> " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        frequency(str);
    }
}