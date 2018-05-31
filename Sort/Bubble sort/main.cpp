#include <iostream>

using namespace std;

// runtime O(N^2)
int main()
{
    int n, temp;
    int *array;

    cin >> n;
    array = new int[n];

    for (int i = 0; i < n; i++) {
        cin >> array[i];
    }

    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            if (array[i] > array[j]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        cout << array[i] << " ";
    }

    delete(array);
    return 0;
}
