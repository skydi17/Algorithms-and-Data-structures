import java.util.Scanner;

//TODO what if checked case sensitive str?
public class CheckPermutation {

    private static final int SIZE = 128;

    private static Boolean isPermutation(char[] s1, char[] s2) {
        if (s1.length != s2.length)
            return Boolean.FALSE;

        int[] count = new int[SIZE];
        for (int i = 0; i < s1.length; i++) {
            count[(int)s1[i]]++;
        }
        for (int i = 0; i < s2.length; i++) {
            int ind = (int)s2[i];
            count[ind]--;
            if (count[ind] < 0)
                return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(isPermutation(s1.toCharArray(), s2.toCharArray()));
    }
}
