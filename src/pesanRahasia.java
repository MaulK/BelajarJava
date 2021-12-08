
import java.util.Scanner;

public class pesanRahasia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String input = n.toLowerCase();
        String temp = "";
        String[] s = input.split("");

        for (String line : s) {
            if (!(temp.contains(line)) && !(line.equals(" "))) {
                temp += line;
            } else {
                continue;
            }
        }

        String dict[] = temp.split("");

        for (String l : s) {
            if (l.equals(" ")) {
                System.out.print(" ");
            }
            for (int i = 0; i < dict.length; i++) {
                if (l.equals(dict[i])) {
                    System.out.print(i + " ");
                }
            }
        }

        in.close();
    }
}








