import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TODO use bit vector
public class ZeroMatrix {

    private static int[][] createZeroMatrix(int[][] arr, int m , int n) {
        Set setM = new HashSet<Integer>();
        Set setN = new HashSet<Integer>();
        for (int i = 0 ; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0 && !setM.contains(i) && !setN.contains(j)) {
                    for (int k = 0; k < m; k++) {
                        arr[k][j] = 0;
                    }
                    for (int k = 0; k < n; k++) {
                        arr[i][k] = 0;
                    }
                    setM.add(i);
                    setN.add(j);
                    break;
                }
            }
        }
        return arr;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextByte();
        int n = in.nextByte();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        arr = createZeroMatrix(arr, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
