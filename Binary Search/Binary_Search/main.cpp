#include <iostream>

using namespace std;

// runtime O(K*log(N))
int main()
{
    int n, k, left, right, middle;
    long long int *array1, *array2;
    cin >> n;
    array1 = new long long int[n];
    cin >> k;
    array2 = new long long int[k];
    for (int i=0; i < n; i++)
        cin >> array1[i];
    for (int i=0; i < k; i++)
        cin >> array2[i];
    for (int i = 0; i < k; i++) {
        left = 0;
        right = n-1;
        while (left < right) {
            middle = (right + left) / 2;
            if (array1[middle] < array2[i]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        cout << ((array1[right] == array2[i]) ? "YES" : "NO") << "\n";
    }
    delete(array1);
    delete(array2);
    return 0;
}
