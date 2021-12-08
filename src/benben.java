import java.util.Scanner;

public class benben {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String matcher = "benben";
        int matcherIndex = 0;
        int benBenCounter = 0;
        for (char string : str.toCharArray()) {
            if (string == matcher.charAt(matcherIndex)) {
                matcherIndex++;
            }
            if (matcherIndex == (matcher.length() - 1)) {
                benBenCounter++;
                matcherIndex = 0;
            }
        }
        System.out.println(benBenCounter);
    }
}