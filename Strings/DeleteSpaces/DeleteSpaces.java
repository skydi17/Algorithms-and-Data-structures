import java.util.Scanner;

public class DeleteSpaces {

    private static String deleteSpaces(String str) {
        int ind = 0, count = 0;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] != ' ' || (s[i] == ' ' && s[i + 1] != ' ')) {
                s[ind] = s[i];
                ind++;
            } else {
                count++;
            }
        }
        return String.valueOf(s).substring(0, s.length - count).trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(deleteSpaces(s));
    }
}
