import java.util.Scanner;

public class Main {

    public static final int ALPHABET = 128;

    private static boolean isPalindromePermutation(char[] str) {
        int[] count = new int[ALPHABET];
        boolean flag = Boolean.TRUE;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                count[str[i]]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                if (flag == Boolean.FALSE)
                    return flag;
                else {
                    flag = Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPalindromePermutation(str.toCharArray()));
    }
}
