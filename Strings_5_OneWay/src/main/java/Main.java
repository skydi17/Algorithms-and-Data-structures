import java.util.Scanner;

public class Main {

    private static boolean isEdit (char[] str, char[] modStr) {
        int minLen = str.length > modStr.length ? modStr.length : str.length;
        for (int i = 0; i < minLen; i++) {
            if (str[i] != modStr[i]) {
                for (int j = i + 1; j < minLen; j++) {
                    //insert
                    if ((str.length < modStr.length) &&
                            (str[j-1] != modStr[j]))
                        return Boolean.FALSE;
                    // delete
                    if ((str.length > modStr.length) &&
                            (str[j] != modStr[j-1]))
                        return Boolean.FALSE;
                    // replace
                    if ((str.length == modStr.length) &&
                            str[j] != modStr[j]) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String modStr = in.nextLine();
        System.out.println(isEdit(str.toCharArray(), modStr.toCharArray()));
    }
}
