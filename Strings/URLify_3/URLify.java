import java.util.Scanner;

// runtime: O(N)
public class URLify {

    private static int countSpaces(char[] s, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s[i] == ' ') {
                count++;
            }
        }
        return length + count * 2 - 1;
    }

    private static char[] replaceSpaces(char[] s, int length) {
        int count = countSpaces(s, length);
        for (int i = length - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[count] = '0';
                s[count - 1] = '2';
                s[count - 2] = '%';
                count = count - 3;
            } else {
                s[count] = s[i];
                count--;
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
