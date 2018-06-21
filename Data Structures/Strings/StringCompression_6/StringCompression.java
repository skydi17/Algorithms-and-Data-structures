import java.util.Scanner;

// runtime O(N), where N is length of the str
public class StringCompression {

    private static String compressStr(String s) {
        int count = 0, compLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                compLength++;
            }
        }
        if (compLength * 2 >= s.length())
            return s;

        StringBuilder res = new StringBuilder(compLength);

        for (int i = 0; i < s.length() ; i++) {
            count ++;
            if ((i + 1 >= s.length()) || (s.charAt(i) != s.charAt(i+1))) {
                res.append(s.charAt(i));
                res.append(count);
                count = 0;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(compressStr(s));
    }
}