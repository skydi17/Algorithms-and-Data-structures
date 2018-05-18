#include <iostream>

using namespace std;

// runtime: O(N^2)
int main()
{
    int n, i, data;
    int *array;
    cin >> n;
    array = new int[n+1];
   // cin >> array[0];
    for (int k = 1; k <= n; k++) {
        cin >> data;
        i = k - 1;
        while (i > 0 && array[i] > data) i--;

        i++;

        for (int j = k -1; j >= i; j--)
            array[j+1] = array[j];
        array[i] = data;
    }

    for (int i = 1; i <= n; i++) {
        cout << array[i] << " ";
    }

    delete(array);
    return 0;
}
