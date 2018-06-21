import java.util.Scanner;

//runtime O(N), where N - length of the str
//TODO try to resolve without second loop (use int var to save all appeared words)
public class PalindromePermutation {

    public static final int ALPHABET =
            Character.getNumericValue('z') -
                    Character.getNumericValue('a') + 1;

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
