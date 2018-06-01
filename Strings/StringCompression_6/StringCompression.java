import java.util.Scanner;

// runtime O(N), where N is length of the str
// TODO first count finalCompressedLength
public class StringCompression {

    private static String compressStr(String s) {
        int count = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            count ++;
            if ((i + 1 >= s.length()) || (s.charAt(i) != s.charAt(i+1))) {
                res.append(s.charAt(i));
                res.append(count);
                count = 0;
            }
        }
        return res.length() < s.length() ? res.toString() : s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(compressStr(s));
    }
}