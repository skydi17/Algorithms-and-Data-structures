import java.util.Scanner;

// runtime: O(N)
public class URLify {
    private static char[] replaceSpaces(char[] s, int length) {
        int len = s.length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[len] = '0';
                s[len - 1] = '2';
                s[len - 2] = '%';
                len = len - 3;
            } else {
                s[len] = s[i];
                len--;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = in.nextByte();
        System.out.println(replaceSpaces(s.toCharArray(), length));
    }
}
