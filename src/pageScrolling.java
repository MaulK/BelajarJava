import java.util.*;

public class pageScrolling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int page = input.nextInt();
        int pageOpen = input.nextInt();
        int range = input.nextInt();

        int[] arrpage = new int[range + 1];
        int x = 0;

        if (pageOpen <= page - (range / 2)) {
            for (int i = 0; i < (range + 1); i++) {
                if ((pageOpen - (range / 2)) + i + x > 0) {
                    arrpage[i] = (pageOpen - (range / 2)) + i + x;
                } else {
                    ++x;
                    --i;
                }
            }
        } else {
            for (int i = 0; i < range + 1; i++) {
                arrpage[i] = page - (range) + i;
            }
        }

        if (pageOpen != 1) {
            System.out.print("Prev ");
        }

        for (int i = 0; i < arrpage.length; i++) {
            System.out.print(arrpage[i] + " ");
        }
        if (pageOpen != page) {
            System.out.print("Next");
        }
    }
}
