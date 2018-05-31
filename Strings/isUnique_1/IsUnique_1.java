import java.util.Scanner;

// runtime O(N) = N*log(N)
public class IsUnique_1 {
    private static char[] quickSort(char[] str, int l, int r) {
        int i = l, j = r;
        char temp;

        char middle = str[i + j % 2];

        while (i <= j) {
            while (str[i] < middle) i++;
            while (str[j] > middle) j--;

            if (i <= j) {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;

                i++;
                j--;
            }
        }

        if (i < r) quickSort(str, i, r);
        if (j > l) quickSort(str, l, j);

        return str;
    }

    private static boolean isUnique(String str) {
        char[] sorted = quickSort(str.toCharArray(), 0, str.length() - 1);
        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i] == sorted[i+1])
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isUnique(str));
    }
}
