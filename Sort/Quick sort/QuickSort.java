public class QuickSort {    
	char[] quickSort(char[] str, int l, int r) {
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
}