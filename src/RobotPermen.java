import java.util.Scanner;

public class RobotPermen{
    static Scanner input = new Scanner(System.in);
    static int position = input.nextInt();
    static int[][] area = new int[position + 1][position + 1];

    public static void main(String[] args) {

        int maxSum = 0;
        for (int i = 1; i <= position; i++) {
            for (int j = 1; j <= position; j++) {
                area[i][j] = input.nextInt();
            }
        }
        maxSum = ways(1, position);

        System.out.println(maxSum);
    }

    public static int ways(int x, int y) {
        if (x <= 0 || y <= 0 || x > position || y > position) return 0;
        if (x == position && y == 1) return area[position][1];
        else {
            return Math.max(ways(x, y - 1) + area[x][y], ways(x + 1, y) + area[x][y]);
        }
    }
}