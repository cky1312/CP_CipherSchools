#include <bits/stdc++.h>

using namespace std;

void sort012(vector<int>& arr, int n)
{
    int low = 0, mid = 0, high = n - 1;
    while (mid <= high)
    {
        if (arr[mid] == 0)
        {
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            mid++;
            low++;
        }
        else if (arr[mid] == 1)
            mid++;
        else
        {
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
    }
     for(int i : arr)
        cout<<i<<" ";
}

int main()
{
    int n;
    cin>>n;
    vector<int> vec;
    for(int i = 0; i < n; i++){
        int a;
        cin>>a;
        vec.push_back(a);
    }

    sort012(vec,n);
    return 0;
}