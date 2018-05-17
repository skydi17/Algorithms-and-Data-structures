#include <iostream>
#include <cmath>
#include <cstdlib>

using namespace std;

// runtime O(K* logN)
int main(){

    int n, k, left, right, m;
    long long int *array1, *array2;

    cin >> n;
    cin >> k;

    array1 = new long long int[n];
    array2 = new long long int[k];

    for (int i = 0; i < n; i++) {
        cin >> array1[i];
    }
    for (int i = 0; i < k; i++) {
        cin >> array2[i];
    }
    for (int i = 0; i < k; i++) {
        left = 0;
        right = n - 1;
        while (right - left > 1) {
            m = (right + left) / 2;
            if (array1[m] < array2[i]) {
                left = m;
            } else {
                right = m;
            }
        }
        cout << ((llabs(array1[left] - array2[i]) <= llabs(array1[right] - array2[i])) ? array1[left] : array1[right]) << "\n";
    }
    delete(array1);
    delete(array2);
    return 0;
}
