import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static Scanner input = new Scanner(System.in);
    static void anagram(String str1, String str2) {
        String kalimat1 = str1.replaceAll("\\s", "");
        String kalimat2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (kalimat1.length() != kalimat2.length()) {
            status = false;
        } else {
            char[] Arraykalimat1 = kalimat1.toLowerCase().toCharArray();
            char[] Arraykalimat2 = kalimat2.toLowerCase().toCharArray();
            Arrays.sort(Arraykalimat1);
            Arrays.sort(Arraykalimat2);
            status = Arrays.equals(Arraykalimat1, Arraykalimat2);
        }
        if (status) {
            System.out.println(kalimat2 + " adalah anagram dari " + kalimat1 );
        } else {
            System.out.println(kalimat2 + " bukan anagram dari " + kalimat1 );
        }
    }

    public static void main(String[] args) {
        anagram(input.nextLine(), input.nextLine());

    }
}